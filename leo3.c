#include<stdio.h>
#include<conio.h>
void main()
{
    int a,b,c;
    scanf("%d,%d,%d",&a,&b,&c);
    if(a>b&&a>c)
    printf(a);
    else if(b>c)
        printf(b);
    else
        printf(c);

}
