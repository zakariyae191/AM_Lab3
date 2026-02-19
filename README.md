# AM_Lab3 : Application de Formulaire et Navigation

## Description
Ce projet consiste à créer une application Android permettant de saisir des informations personnelles à travers un formulaire et de les afficher sur un second écran de récapitulatif. Ce TP met en pratique l'utilisation des **Intents** pour le transfert de données entre activités.

---



---

## Étapes de Réalisation

### Étape 1 : UI du Formulaire — `res/layout/activity_main.xml`
Conception de l'interface utilisateur avec un `LinearLayout`. Utilisation de labels `TextView`, de champs de saisie `EditText` (configurés avec des `inputType` adaptés) et d'un `Spinner` pour la sélection de la ville.
<img width="1515" height="784" alt="image" src="https://github.com/user-attachments/assets/72b3e6a2-5697-49e2-8667-02a38bb39745" />


### Étape 2 : UI du Récapitulatif — `res/layout/activity_screen2.xml`
Création d'un layout simple contenant un `TextView` central pour afficher les informations formatées.
<img width="1527" height="751" alt="image" src="https://github.com/user-attachments/assets/6118023b-21d4-46ca-b000-ce09bac343ef" />


### Étape 3 : Code du Formulaire — `MainActivity.java`
Développement de la logique métier :
* Initialisation des vues et du `Spinner`.
* Gestion du clic sur le bouton "Envoyer".
* Validation du format d'email.
* Utilisation d'un **Intent explicite** et de `putExtra()` pour envoyer les données.

<img width="1320" height="934" alt="image" src="https://github.com/user-attachments/assets/f2d2cbfa-5c0b-41c3-89c2-1558cd146576" />


### Étape 4 : Code du Récap — `Screen2Activity.java`
Récupération des données transmises via l'objet `Bundle` (avec `getIntent().getExtras()`) et mise à jour de l'affichage.
<img width="1129" height="735" alt="image" src="https://github.com/user-attachments/assets/291b419d-d004-46a8-9b46-80d503969d9a" />

### Étape 5 : Déclaration dans `AndroidManifest.xml`
Enregistrement des deux activités pour permettre la navigation entre elles.
<img width="925" height="285" alt="image" src="https://github.com/user-attachments/assets/44932439-2ba6-43f5-a291-f16b9a0358f8" />


### Étape 6 : Test pas à pas
Vérification du flux complet : Saisie -> Validation -> Transfert -> Affichage.

##Aperçu du Résultat
| Écran1 (Navigation) | Écran 2 (Screen2) |
| :---: | :---: |
| <img width="365" height="758" alt="Screenshot 2026-02-18 211638" src="https://github.com/user-attachments/assets/2d35e536-7413-4cfb-a289-8721540d26f0" />|<img width="355" height="740" alt="Screenshot 2026-02-18 211647" src="https://github.com/user-attachments/assets/15b0cc34-b1f8-47e5-86ec-6f4b7f8caf30" /> |
 


---

##  Bonus 
* **Validation Email** : Utilisation de `Patterns.EMAIL_ADDRESS` pour vérifier la validité de l'adresse saisie.
* **Réinitialisation au retour** : Possibilité de vider les champs lors du retour sur l'écran principal via `onResume()`.
* **Partage (Optionnel)** : Possibilité d'ajouter un Intent `ACTION_SEND` pour partager le récapitulatif par SMS ou Email.

<img width="985" height="311" alt="image" src="https://github.com/user-attachments/assets/292dcf3a-8da2-482e-be86-785c8033b522" />

---

## Compétences Appliquées
* Gestion des Layouts XML.
* Manipulation des Intents Explicites.
* Passage de données via `Bundle`.
* Cycle de vie des activités (finish(), onResume()).
