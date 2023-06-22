# SGrJava

## Index
[Summary](#summary)<br>
[Description](#description)<br>
[Build and publish for development](#build-and-publish-for-development)<br>
[Build and publish a release](#build-and-publish-a-release)<br>
[Generate emfEI4Modbus classes](#generate-emfei4modbus-classes-afte-xml-schema-updates)<br>

## Summary
SGrJava is home for the SmartgridReady core components, the communication handler implementations.
Current list of communication handlers:
- CommHandler4Modbus
- CommHandler4Rest (planned)

A communication handler maps the SmartgridReady generic interface to a device/product specific interface. The interface mapping is defined within an external interface description in XML. (see https://github.com/SmartgridReady/SGrSpecifications/tree/master/XMLInstances/ExtInterfaces)

The external interface description XML describes for every functionalprofile-datapoint tuple the properties needed to read/write date from/to the datapoint.

## Description

SGrJava conists of two subprojects:
- CommHandler4Modbus
- emfEI4Modbus

### Commhandler4Modbus
Commhandler4Modbus is the realization of the commmunication-handler for modbus RTU and TCP. It depends in emfEI4Modbus, that provides the classes needed to load XML device descriptions. The basic implementation class is ```SGrDevice```, that implements all the generic interface methods to access an SGr compliant device.


### emfEI4Modbus
emfEI4Modbus provides the Java-XML binding of XML device descriptions. The classes can be generated from an XML-Schema that provides the model for the device descriptions. Eclipse EMF (Eclipse Modeling Framework) tools are then used to generate the generate Java classes. For details see [Generate emfEI4Modbus classes](#generate-emfei4modbus-classes-afte-xml-schema-updates).


## Build and publish for development

### Prerequisites
- Java JDK version >= 1.8
- <b>SGrGenDriverAPI</b> and <b>EasyModbus</b> must be published to the local maven directory. See readme.md of https://github.com/SmartgridReady/SGrJavaDrivers. Chapter https://github.com/SmartgridReady/SGrJavaDrivers#build-and-publish-for-development.
- Have a local clone of the SGrSpecifications project to get the XML-Schema resources from. See https://github.com/SmartgridReady/SGrSpecifications
- Current eclipse installation with EMF features installed (EMF features shipped with standard Eclipse).

Rem: You can use a different IDE such as IntelliJ, however Eclipse must be additionally installed to allow
automatic code-generation using Eclipse EMF.

### Configure gradle.properties
The project relies on automatic code generation using Eclipse EMF and Gradle. Gradle needs to know the location
your Eclipse installation and the root XSD-file of the SGrSpecification. Edit your ```gradle.properties``` file and add the new entries as follows. By default, the ```gradle.properties``` file can be found on:
- Windows: ```C:\Users\<username>\.gradle```
- Unix: ```USER_HOME\.gradle```

New entries to add:
```
xsd2java.eclipse.home=<<path to your Eclipse installation where exlipse.exe resides>>
xsd2java.xsd.resource=<<your SGrSpecifications root folder>>/SchemaDatabase/SGr/SGrIncluder.xsd
```
Example:
```
xsd2java.eclipse.home=c:/java/eclipse-2020-12
xsd2java.xsd.resource=c:/dev/SGrSpecifications/SchemaDatabase/SGr/SGrIncluder.xsd
```

### Run the gradle build and publish to the local maven repository
- Change to the local ```{project-root}/SGrJava``` directory.
- To build the project run:
    ```
    bash>gradle clean build
    ```
- To publish to the local Maven repository run:
    ```
    bash>gradle publishToMavenLocal
    ```

When using an IDE (Intellij/Eclipse) you can also use the IDE's Gradle integration to run 'publishToMavenLocal'. The steps above will compile, build the library jar and publish the library to the local maven repository.

## Build and publish a release
- Obtain a Github access token for your Github account. This has to be done once before you can  publish to GitHub. See [Obtaining a GitHub token for publishing](https://github.com/SmartgridReady/SGrJavaDrivers#obtaining-a-github-token-for-publishing)

- Change to the local ```{project-root}/SGrJava``` directory.
- Check that the ```build.gradle``` file has the correct version number for the ```sgr-driver-api.jar``` file:
    ```
    publishing {
        publications {
            api(MavenPublication) {
                groupId = 'ch.smartgridready'
                artifactId = 'commhandler4modbus'
                version = '<correct-version>'

                from components.java        
            }
        }
    }
    ```
    <b>Rem:</b> GitHub will not accept publishing a version that already exists within the repository. If you want to override published version you must delete the existing package of the library first.

- Run the command:
    ```
    bash>gradle publishAllPublicationsToGitHubRepository
    ```

## Manually emfEI4Modbus classes afte XML-Schema updates
The code for the emfEI4Modbus classes is now automatically generated by the Gradle build as soon as the XML-Schema changes.<br>
Additionally you can generate the classes manually from the Eclipse IDE if needed. This section describes how to generate
the classes manually from the Eclipse menu:

- Delete the content of ```<project-root>/emfEI4Modbus/src``` (it contains 3 package folders: com.smargridready.ns.V<i>n</i>.*)

- Delete the files:
    ```
    - <project-root>/emfEI4Modbus/model/emfEI4Modbus.genmodel
    - <project-root>/emfEI4Modbus/model/V<i>n</i>.model
    ```
- In the Project Explorer select the folder ```<project-root>/emfEI4Modbus/model``` and press the right mous button.
- In the right-click context-menu select [File][New][Other...]
- From the provided Wizards select 'EMF-Generator-Model' (type it in the search box)
- Press [Next]
- Under 'Enter or select the parent folder' it should read ```<project-root>/emfEI4Modbus/model```
- In the 'File name:' textbox type 'emfEI4Modbus.genmodel'
- Press [Next]
- In the Dialog 'Select Model Importer' choose 'XML-Schema'
- In the Dialog 'XML Schema Import' choose 'Browse File System' or 'Brows Workspace' if you have your SGrXMLSpecification folders in the Eclipse workspace.
- Browse to ```<sgr-specifications-root>/SchemaDatabase/SGr``` and select ```SGrIncluder.xsd```
- Press [OK]
- Press [Next]
- Within the Dialog 'Package Selection' press [Finsh]. The ```'emfEI4Modbus.genmodel'``` will be generated now.
- In the source code editor window select the tab [emfEI4Modbus.genmodel] (it should have appeared automatically after generating the genmodel file)
- Right click on the 'EmfEI4Modbus' element in the source code editor window.
- Select 'Generate Model Code' in the context-menu. Now the model classes will be generated to ```<project-root>/emfEI4Modbus/src```.

