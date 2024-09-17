#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

int main () {
    int N;
        scanf(" %d", &N);
    
    char bomOUmau[N];
    char nomes[N][20];

    for( int i = 0; i < N; i++) {
        scanf(" %c %s", &bomOUmau[i], nomes[i]);
    }

    int comportados = 0;
    int Ncomportados = 0;

    for( int i = 0; i < N; i++) {
        if (bomOUmau[i] == '+') {
            comportados++;
        } else {
            Ncomportados++;
        }
    }

    for ( int i = 1; i < N; i++) {
        char menor[20];
        strcpy(menor, nomes[i]);
        int j = i - 1;

        while(j>=0 && strcmp(nomes[j], menor) > 0) {
            strcpy(nomes[j+1], nomes[j]);
            j--;
        }

        strcpy(nomes[j+1], menor);
    }

    for ( int i = 0; i < N; i++) {
        printf("%s\n", nomes[i]);
    }

    printf("Se comportaram: %d | Nao se comportaram: %d\n", comportados, Ncomportados);
}