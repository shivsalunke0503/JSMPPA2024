#include<stdio.h>
#include<fcntl.h> //file control
#include<unistd.h> //universal standards
#include<string.h>
int main()
{
    int fd = unlink("jsm.txt");
    printf("file successfully deleted %d",fd);
    return 0;
}