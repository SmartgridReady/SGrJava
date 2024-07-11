#!/bin/bash
export DISPLAY=:99

cd /host/projectdir

echo 'creating ecore-model and genmodel'
/opt/eclipse/eclipse -console -noSplash -data ./ -application org.eclipse.xsd.ecore.importer.XSD2GenModel SGrSpecifications/SchemaDatabase/SGr/SGrIncluder.xsd  SGrJava/SGrSpecification/model/SGrSpecification.genmodel -modelProject SGrJava/SGrSpecification/ src/main/java -modelPluginId SGrSpecification

echo 'replacing _ for Java 17+ compatibility'
sed -i 's#EmptyValue/_#EmptyValue/_0#g' SGrJava/SGrSpecification/model/SGrSpecification.genmodel
sed -i 's#"_"#"_0"#g' SGrJava/SGrSpecification/model/v0.ecore

echo 'generate sources'
/opt/eclipse/eclipse -console -noSplash -data ../ -application org.eclipse.emf.codegen.ecore.Generator -forceOverwrite SGrJava/SGrSpecification/model/SGrSpecification.genmodel ./SGrJava/SGrSpecification

echo 'copy sources to projectdir'
rm -R /host/projectdir/SGrJava/SGrSpecification/src
mv /host/projectdir/SGrJava/SGrSpecification/projectdir/SGrJava/SGrSpecification/src /host/projectdir/SGrJava/SGrSpecification
chmod -R 777 /host/projectdir/SGrJava/SGrSpecification