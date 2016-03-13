# Bienvenue sur le projet Meetup-like de la communauté Software Craftsmanship Lyon

/!\ Nous essayons de conserver à jour une documentation en français et anglais, [voir le readme en Anglais](readme.md).
Cependant le code est en anglais, les mots en anglais dans la documentation en français reflètent donc le vocabulaire
métier utilisé comme référence. Par convention, ces mots anglais sont mis en italique.

Le but de ce projet est de dépasser les katas, avec un vrai projet sur lequel on veut expérimenter concrêtement 
les pratiques Software Craftsmanship, et ne pas se limiter à des discussions !

En pratiquant, on espère échanger sur de nombreux sujets.

## Pourquoi un Meetup-like ?

Nous avons pensé que c'était un projet suffisament "complexe" pour éviter les biais des katas ("too simple"). 
Nous espérons aussi (peut-être) construire une alternative libre et ouverte à Meetup...à suivre...

## Tools

Un board Trello est associé à ce dépôt : https://trello.com/b/zuo7PmoE/swcraftmeetup

Vous pouvez aussi nous rejoindre sur le Slack Lyon Tech Hub, channel #swcrafts_meetup 
(https://lyontechhub.slack.com/messages/swcrafts_meetup, inscription: https://slack.lyontechhub.org/).

Le Meetup Software Craftsmanship Lyon : http://www.meetup.com/fr-FR/Software-Craftsmanship-Lyon 
et Slack : https://lyontechhub.slack.com/messages/swcraftsmanship

## Pochaine étape

Commencer l'implémentation des premières User Stories définies lors de la dernière rencontre.
On a découpé les User Stories en 3 sous-domaines/contextes:
- *Activities* : ce que les personnes proposent pour un événement: un talk, un atelier, une course, un jeu...
- *Events* : organiser un événement qui proposera des activités et auquel les personnes pourront participer...
- *Subscriptions* : comment les participants disent qu'ils rejoindront un événement...

Nous avons partagé que chaque context pourra utiliser une technologie différente, puisque nous souhaitons les découpler
(et que par la même occasion, cela permet d'utiliser différentes technologies sur le projet...
satisfaisant ainsi les enviess de tout le monde).

Objectif: faire une revue/démo de ce qui aura été produit, discuter des sujets ayant émergé lors du prochain événement IRL

## Etapes passées

Décembre 2015 - Event Storming : découvrir le domaine métier (au sens DDD - Domain Driven Design)
Photos : https://onedrive.live.com/redir?resid=F7CF3C16666D84B7!2719&authkey=!ACl6Bnvgf96SlxA&ithint=folder%2cjpg

Février 2016 - User Stories : lister et prioriser les premières User Stories 
avec une approche MVP (Minimu Viable Product)...
Nous avons aussi discuter de quel langage utiliser pour les implémenter, concluant qu'un découplage des contextes
permettrait au plus grand nombre de participer, sur une partie du produit, avec une diversité de technologies...
   
## Sujets brûlants :)

Tout le monde est le bienvenu sur ce projet, avec de nombreux profils différents.

Certaines discussions autour du projet mènent à partager des visions tranchées (certains diraient "trolls" parfois)
Voici une liste non exhaustive (à détailler pour donner les pours et les contres de chauque vision):
- Frameworks vs libs : certains se reposent sur des frameworks comme base, 
d'autres préfèrent les libs unitaires et éviter le couplage avec un framework
- Quelle platforme/technologie devrait-on utiliser : certains préfèrent rester dans leur environnement de prédilection,
d'autres veulent explorer de nouvelles choses (approche fonctionnelle, langages...)
- Licences : faire un projet libre et ouvert mène à discuter des licences, le sujet n'est pas très bien connu,
seuls certaines personnes en savent plus...on a démarré avec une licence MIT.
- "Micro-services" : attention au mot clé...(on a parlé de "petits" services, pour éviter de nommer le mot clé ;))

## Contributions

Les messages de commit doivent avoir le format suivant :

    <type>(<portée>): <message>
    
    <description>

### Types autorisés:

- **feat** (nouvelle fonctionnalité au sens utilisateur et non au sens technique)
- **fix** (correction d'erreur au sens utilisateur et non au sens technique)
- **docs** (changements concernant la documentation)
- **style** (formattage, point virgule manquants, etc; pas de changement de code fonctionnel)
- **refactor** (refactoring de code fonctionnel, ie. renommage d'une variable)
- **test** (ajout de tests manquants, refactoring de tests; pas de changement de code fonctionnel)
- **chore** (modification de fichiers de build, de gestion de dépendances ou autres; pas de changement de code fonctionnel)

### Exemples de portée :

- init
- ui
- api
- config
- etc.

La `<portée>` est facultative (ie. si le changement est global ou difficile à attribuer à un seul composant), dans quel cas les parenthèses sont omises.

### Message

Le message doit décrire la valeur ajoutée sur une ligne.

### Description

La `<description>` est facultative. Elle peut être ajoutée si un choix technique est important du point de vue du sofware craftmanship.

Les issues résolues par le commit peuvent être également mentionnées à la fin de la `<description>` en ajoutant `closes #<issue>`.

    closes #123, #124

Les issues mentionnées seront automatiquement fermées une fois la Pull Request mergée. 
