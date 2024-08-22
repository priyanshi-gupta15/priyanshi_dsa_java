

// public class solution {
//     public static void main(String[] args) {
//         String moves = "VD";
//         char[] ch = moves.toCharArray();
//         // System.out.println(Arrays.toString(ch));
//         int left = 0;
//         int right = ch.length-1;
//         while (left <= right) {
//           int ascii1  = ch[0];
//           int ascii2   = ch[1];
            
//             if ((ascii1 >= 65 || ascii1 <= 90) &&( ascii2 >= 65 || ascii2 <= 90)) {
//                 if ((ascii1 > 77 && ascii2 <78) || (ascii1 < 78 && ascii2 > 77)) {
//                     int p = 90-ascii1;
//                     int q = ascii2 - 65;
//                      if(p==q){
//                         System.out.println("true");
//                         left++;
//                         right--;
//                     } 


//                 } else {
//                     break;
//                 }
            
//             }
            
            
//             // else{
//             //     return false;
//             // }
//         }
//    }
   

   
// }
// // else if (ascii1 >= 97 && ascii1 <= 122 && ascii2 >= 97 && ascii2 <= 122) {
//             //     if ((ascii1 > 109 && ascii2 <= 109) || (ascii1 <= 109 && ascii2 > 109)) {

//             //     } else {
//             //         break;
                    
//             //     }

//          //   }
// class solution {
//  public static void main(String[] args) {
//      String s ="Myself2 Me1 I4 and3";
     


//      String[] s1 = s.split(" ");
     

//      Arrays.sort(s1);

//      System.out.println(Arrays.toString(s1));
//      String str = String.join(" ", s1);
     
//     String i = str.replaceAll("[0-9]","");
// System.out.println(i);
//     }
// }

// // class solution {
//     public String sortSentence() {
//     String s = "is2 sentence4 This1 a3";
//      String[] s1 = s.split(" ");
//      s1 = Arrays.sort(s1);
//     }
// }
// class solution {
//     public String sortSentence(String s) {
//         String[] str = new String[s.split(" ").length];
//         for(String st : s.split(" "))
//         {
//             str[st.charAt(st.length()-1) - '1'] = st.substring(0,st.length()-1);
//         }
//         return String.join(" ",str);
//     }
// }

// class solution {
//     public boolean(String s) {
//  String s1 = s.split((s.length()-1)/2);
//         return s1;
//     }
// }