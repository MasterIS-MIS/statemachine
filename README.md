# Statemachine sample
Project with a metamodel definition, a graphical, a textual editor and model to text transformations.

## lsi.us.es.mis.statemachine 
Project that contains a simple statemachine metamodel. The root of the metamodel is the _StateMachine_ metaclass. A _statemachine_ is composed of _states_ and _transitions_, 
that are modelled by means of the _State_ and _Transition_ metaclasses, respectively. _States_ are related to other states by means of incoming and outgoing transitions.

![image](https://github.com/MasterIS-MIS/statemachine/assets/72299672/2d37ff3e-180b-4bfa-8621-ea3c8bef4d86)

## lsi.us.es.mis.statemachine.design
Project that contains the specification of the Sirius generated graphical editor. The specification of the editor is in the statemachine.odesign file. This is a DSL for specifying graphical editors in Sirius.
![image](https://github.com/MasterIS-MIS/statemachine/assets/72299672/99699c9f-b894-4555-8df1-6a55c65f1d56)

## lsi.us.es.mis.xtext.statemachine.* 
Set of projects that contains the XText grammar and the model to text transformations. 
The grammar is quite simple. A _Statemachine_ has _states_ and _transitions_. _States_ are defined as a list of comma separated elements. While _transitions_ are a list of origin_state->target_state sentences.

![image](https://github.com/MasterIS-MIS/statemachine/assets/72299672/af95e53f-8a1a-4fad-b071-113afc2a0ee8)

An example of instance of the previous grammar is:

![image](https://github.com/MasterIS-MIS/statemachine/assets/72299672/0754eb24-924c-41e0-8ee1-ae1dfada1ef6)

There are two model to text transformations defined:
* StateMachine to GraphViz
* StateMachine to Java
