# Statemachine sample
Project with a metamodel definition, a graphical, a textual editor and model to text transformations.

## lsi.us.es.mis.statemachine 
Project that contains a simple statemachine metamodel. The root of the metamodel is the _StateMachine_ metaclass. A _statemachine_ is composed of _states_ and _transitions_, 
that are modelled by means of the _State_ and _Transition_ metaclasses, respectively. _States_ are related to other states by means of incoming and outgoing transitions.

![image](https://github.com/MasterIS-MIS/statemachine/assets/72299672/2d37ff3e-180b-4bfa-8621-ea3c8bef4d86)

## lsi.us.es.mis.statemachine.design
Project that contains the Sirius generated graphical editor.

## lsi.us.es.mis.xtext.statemachine.* 
Set of projects that contains the XText grammar and the model to text transformations.

