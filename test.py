f = open("locations_corpus1.txt")
liste1 = eval(f.read())
f.close()

f = open("locations_corpus2.txt")
liste2 = eval(f.read())
f.close()

lieux1 = set(liste1)
lieux2 = set(liste2)

lieux_en_commun = lieux1.intersection(lieux2)
print("Intersection", len(lieux_en_commun))
print("dans lieux 1", len(lieux1.difference(lieux2)))
print("dans lieux 2", len(lieux2.difference(lieux1)))

freq1 = {}
for lieu in liste1:
  freq1.setdefault(lieu, 0)
  freq1[lieu]+=1

freq2 = {}
for lieu in liste2:
  freq2.setdefault(lieu, 0)
  freq2[lieu]+=1

L= []

for lieu in lieux_en_commun:
  GR = freq1[lieu]/ freq2[lieu]
  L.append([GR, lieu])
for i in sorted(L):
  print(i)
