
    static Stack<Character> st = new Stack<>();
 
  
    static void insert_at_bottom(char x){
 
        if (st.isEmpty()){
            st.push(x);
            return ;
        }
            char a = st.pop();
            insert_at_bottom(x);
            st.push(a);
        
    }
 

    static void reverse(){
        if (st.size() > 0) {
            char x = st.pop();
            reverse();
            insert_at_bottom(x);
        }
    }
