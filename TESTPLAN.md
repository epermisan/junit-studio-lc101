## Llista de classes de prova:
#### Només els claudàtors tornen veritables:

Per exemple, si tenim una funció que verifica si una seqüència de caràcters conté només claudàtors, aquesta funció hauria de tornar true per a seqüències com {}, [], o ().

---

#### Es permeten claudàtors imbricats:

Per exemple, si tenim una funció que verifica si una seqüència de caràcters és un conjunt de claudàtors vàlids, aquesta funció hauria de tornar true per a seqüències com {[]}, [()], o ({}) i false per a seqüències com {[}], [(]), o ({]}).

---

#### Els claudàtors han de seguir l'ordre d'obertura de tancament:

Per exemple, si tenim una funció que verifica si una seqüència de caràcters és un conjunt de claudàtors vàlids, aquesta funció hauria de tornar true per a seqüències com {}, [], o () i false per a seqüències com }{ , ][ , o )(.

---

#### Un claudàtor obert sense el corresponent claudàtor de tancament retorna fals:

Per exemple, la cadena {[ seria invàlida perquè falta el claudàtor de tancament ].

---

#### Un claudàtor de tancament sense el corresponent claudàtor d'obertura retorna fals:

 Per exemple, la cadena ]} seria invàlida perquè falta el claudàtor d’obertura [.

---

#### Els claudàtors imbricats de diferents tipus (per exemple, `{[()]}`) tornen veritables:

Aquest cas de prova comprova que si tens claudàtors imbricats de diferents tipus (com ara {[()]}), la funció hauria de retornar true.

---

#### Una seqüència de claudàtors amb l'ordre correcte però sense imbricació (per exemple, `()[]{}()[]{}`) torna veritable:

 Aquest cas de prova comprova que si tens claudàtors imbricats del mateix tipus (com ara {{{{}}}}), la funció hauria de retornar true.

---

#### Una seqüència de claudàtors amb l'ordre incorrecte (per exemple, `({)}`) torna fals:

Aquest cas de prova comprova que si tens una seqüència de claudàtors amb l’ordre correcte però sense imbricació (com ara ()[]{}()[]{}), la funció hauria de retornar true.

---

#### Una seqüència de claudàtors amb l'ordre correcte però amb un claudàtor de tancament extra (per exemple, `()[]{}()[]{}]`) torna fals:

Aquest cas de prova comprova que si tens una seqüència de claudàtors amb l’ordre incorrecte (com ara ({)}), la funció hauria de retornar false.

---
#### Una seqüència de claudàtors amb l'ordre correcte però amb un claudàtor d'obertura extra (per exemple, `()[]{}()[]{}(`) torna fals:

Aquest cas de prova comprova que si tens una seqüència de claudàtors amb l’ordre correcte però amb un claudàtor de tancament extra (com ara ()[]{}()[]{}]), la funció hauria de retornar false.

---

#### Una seqüència buida de claudàtors torna veritable:

Aquest cas de prova comprova que si tens una seqüència de claudàtors amb l’ordre correcte però amb un claudàtor d’obertura extra (com ara ()[]{}()[]{}(), la funció hauria de retornar false.

--- 