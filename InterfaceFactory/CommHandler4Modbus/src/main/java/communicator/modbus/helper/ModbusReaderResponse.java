/**
Copyright(c) 2022 Verein SmartGridready Switzerland

This Open Source Software is BSD 3 clause licensed:
Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in
the documentation and/or other materials provided with the distribution.
3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from
this software without specific prior written permission.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package communicator.modbus.helper;

import java.util.Arrays;

public class ModbusReaderResponse {
    private int[] mbregresp = new int[256];
    private boolean[] mbbitresp = new boolean[64];
    private boolean bGotRegisters = false;
    private boolean bGotDiscrete = false;

    public int[] getMbregresp() {
        return mbregresp;
    }
    
    public int[] getMbregresp(int offset, int len) {    
    	len = Math.min(mbregresp.length - offset, len); // will cut if offset + len > than array size
    	return Arrays.copyOfRange(mbregresp, offset, offset + len );
    }

    public void setMbregresp(int[] mbregresp) {
        this.mbregresp = mbregresp;
        this.bGotRegisters = true;
    }            

    public boolean[] getMbbitresp() {
        return mbbitresp;
    }
    
    public boolean[] getMbbitresp(int offset, int len) {    	
    	len = Math.min(mbregresp.length - offset, len); // will cut if offset + len > than array size    	
    	return Arrays.copyOfRange(mbbitresp, offset, offset + len);
    }    

    public void setMbbitresp(boolean[] mbbitresp) {
        this.mbbitresp = mbbitresp;
        this.bGotDiscrete = true;
    }

    public boolean isbGotRegisters() {
        return bGotRegisters;
    }

    public boolean isbGotDiscrete() {
        return bGotDiscrete;
    }
}
