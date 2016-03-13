[![Stories in Ready](https://badge.waffle.io/swcraftlyon/meetup.png?label=ready&title=Ready)](https://waffle.io/swcraftlyon/meetup)
# Welcome on Meetup-like project of Software Craftsmanship Lyon community

/!\ If you prefer French, we try to keep French & English versions up to date : [see French readme](lisezmoi.md). Code is in English.

The goal of this project is to go beyond katas, with a "real" project on which we want to experiment Software 
Craftsmanship practices concretely, not just discuss about it !

Practicing we expect to have lots of things to exchange together.

## Why Meetup-like ?

We thought it would be enough "complex" project to work on to avoid "simplicity" bias of katas.
We also hope to (perhaps) build a free and open alternative to Meetup...let's see...

## Tools

There is a Trello board associated with this repository : https://trello.com/b/zuo7PmoE/swcraftmeetup
(in French for now...)

You can also join us on Lyon Tech Hub Slack, channel #swcrafts_meetup
(https://lyontechhub.slack.com/messages/swcrafts_meetup, get your invitation: https://slack.lyontechhub.org/).
It is in French, but you can try in English, some will answer. 

Software Craftsmanship Lyon Meetup (for IRL events) : http://www.meetup.com/fr-FR/Software-Craftsmanship-Lyon 
and Slack : https://lyontechhub.slack.com/messages/swcraftsmanship

## Next step

Begin implementing first User Stories. We split User Stories in 3 sub-domains/contexts : 
- Activities : what people have to propose for an event, can be a talk, a workshop, a run, a game...
- Events : organize an event that will propose activities and that people can join to share this activity... 
- Subscriptions : how participants say that they will join an event...

It was shared that we can use different technologies for each context, since we want to decouple them 
(and by the way, it allows to use several technologies...
then everyone should be able to find what they search in this project).  

Goal: review and/or show what will be done, discuss about subjects that will raise on next IRL event

## Previous steps

December 2015 - Event Storming : to discover the "domain" (in the sense of DDD-Domain Driven Design)
Pictures : https://onedrive.live.com/redir?resid=F7CF3C16666D84B7!2719&authkey=!ACl6Bnvgf96SlxA&ithint=folder%2cjpg

February 2016 - User Stories : list and prioritize first User Stories to implement, 
with a MVP (Minimu Viable Product) spirit in mind...
We also discuss about which language to use to implement these stories, ending with the idea that decoupling
contexts could allow more people to contribute, with a diversity of platforms, technologies...   

## Hot topics :)

We welcome everyone in this project, with lots of different profiles.

Some discussions around this project led to share several opinionated visions (some would say "trolls"). 
Here is an excerpt of these (to detail to give pros and cons of each visions) :
- Frameworks vs libs : some heavily rely on frameworks at first, 
others prefer small libs and avoid coupling with frameworks 
- Which platform/technology should we use : some prefer using their preferred environment, 
some wants to discover new things (functional approach, languages...) 
- Licences : free and open project lead to discuss about licences, the subject is not really well known, 
some people knows more about it...we started with a MIT licence.
- "Micro-services" : beware of the keyword...(we talked about "small" services, to avoid naming it ;))

## Contributing

Commit messages should have the following format.

    <type>(<scope>): <message>
    
    <description>

### Allowed type values:

- **feat** (new feature for the user, not a new feature for build script)
- **fix** (bug fix for the user, not a fix to a build script)
- **docs** (changes to the documentation)
- **style** (formatting, missing semi colons, etc; no production code change)
- **refactor** (refactoring production code, eg. renaming a variable)
- **test** (adding missing tests, refactoring tests; no production code change)
- **chore** (updating grunt tasks etc; no production code change)

### Example scope values:

- init
- ui
- api
- config
- etc.

The `<scope>` can be empty (eg. if the change is a global or difficult to assign to a single component), in which case the parentheses are omitted.

### Message

The message should describe the added value on one line.

### Description

The `<description>` can be empty. It can be added if a technical choice is worth mentioning from a sofware craftman's point of view.

Closed issues can be declared on the last line of `<description>` by adding `closes #<issue>`.

    closes #123, #124

Those issues will be automatically closed upon merging the Pull Request.
