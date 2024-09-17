#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

int main () {
    int N;
        scanf(" %d", &N);

    char nomes[N][20];
    int idades[N];
    int qntTimes = N/3;

    for(int i = 0; i < N;i++){
        scanf(" %s", nomes[i]);
        scanf(" %d", &idades[i]);
    }
    for(int i = 1; i < N;i++) {
        char velho[20];
        strcpy(velho, nomes[i]);
        int veio = idades[i];
        int j = i -1;
        while(j>=0 && veio > idades[j]) {
            strcpy(nomes[j+1], nomes[j]);
            idades[j+1] = idades[j];
            j--;
        }
        strcpy(nomes[j+1], velho);
        idades[j+1] = veio;
    }
    for(int i = 0; i < qntTimes; i++) {
        printf("Time %d\n", i+1);
        printf("%s %d\n", nomes[i], idades[i]);
        printf("%s %d\n", nomes[i+qntTimes], idades[i+qntTimes]);
        printf("%s %d\n\n", nomes[i+(2*qntTimes)], idades[i+(2*qntTimes)]);
    }
    
    return 0;
}