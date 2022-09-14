//Solution 1

public class Bio{
    public String dnaToRna(String dna){
        return dna.replace("T", "U");
    } 
}

//Solution 2

public class Bio {
    public String dnaToRna(String dna) {
        
     StringBuilder builder = new StringBuilder();

             for(int i=0;i<dna.length();i++){
                  
                  if(dna.charAt(i) == 'T'){
                      builder.append('U');
                  }
                  else if(dna.charAt(i) == 'A'){
                      builder.append('A');
                  }
                  else if(dna.charAt(i) == 'G'){
                      builder.append('G');
                  }
                  else if(dna.charAt(i) == 'C'){
                      builder.append('C');
                  }   
             }
             return builder.toString();
        }
    } 
      
     


// DESCRIPTION:
// Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems. It is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').

// Ribonucleic acid, RNA, is the primary messenger molecule in cells. RNA differs slightly from DNA its chemical structure and contains no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil ('U').

// Create a function which translates a given DNA string into RNA.

// For example:

// "GCAT"  =>  "GCAU"
// The input string can be of arbitrary length - in particular, it may be empty. All input is guaranteed to be valid, i.e. each input string will only ever consist of 'G', 'C', 'A' and/or 'T'.

// FUNDAMENTALS STRINGS
      
