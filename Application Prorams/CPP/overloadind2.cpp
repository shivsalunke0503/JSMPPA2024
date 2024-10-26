1. we can overload the function by changing no of arguments 
    class Demo
    {
        int Adddition(int a,int b){}; //2 arguments
        int Adddition(int a,int b, int c){}; // 3 arguments
    };

2. we can overload the function by changing data types of arguments
    class Demo
    {
        int Adddition(int a,int b){}; 
        float Adddition(float a,float b){}; 
    };

3. we can overload the function by changing sequence of parameters
    class Demo
    {
        float Adddition(int a,float b){}; 
        float Adddition(float a,int b){}; 
    };    

4. we can not overload the function by changing its return type
    class Demo
    {
        int Adddition(int a,int b){}; 
        void Adddition(int a,int b){}; 
    };


5. we can not overload the function by changing its access specifier
    class Demo
    {
        public:
            int Adddition(int a,int b){}; 
        private:
            int Adddition(int a,int b){}; 
    };