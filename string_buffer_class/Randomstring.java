
package string_buffer_class;

import java.util.Random;

public class Randomstring {

    static  String generate(int size) {

        @SuppressWarnings("StringBufferMayBeStringBuilder")
        StringBuffer sb = new StringBuffer(size);

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            
            int randomChar = 97+ (int) (random.nextFloat()*26);
            sb.append((char)randomChar);
        }
        return sb.toString();    
    }
    
}
