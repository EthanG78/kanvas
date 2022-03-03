# kanvas

## Concept

Small MS-paint like utility that provides users with the ability to create
diagrams and drawings with ease.

The application will present the user with a canvas and various drawing tools.
Any of the drawing tools can be used to add detail to their canvas. For
example, there will be shapes that users can place onto their canvas, or they
can select a basic pen.

## Tentative Design Patterns

**Singleton**
Each of the applications UI elements will follow the singleton pattern. This
includes the single canvas and each of the available drawing tools

**Factory**
For each of the concrete shapes (triangle, square, etc.) that are available to
draw, they will all be created using a generic shape factory.

**Prototype**
For the ability to copy drawing tools, the protype pattern will be used.

**Bridge**
For the ability to draw a shape with the 'pen' and then having the application
convert it to a concrete shape, the bridge patten will be used.

**Command Pattern**
All command operations, like saving the current canvas, will use the command pattern.

**Iterator**
The canvas will contain numerous elements on it. To save the canvas, its
elements must be individually saves. To acheive this, the canvas will realize
the iterator pattern.

**Decorator**
The Compose Multi-platform SDK offers numerous decorators for their components.

## First Iteration UML Diagram
![UML Diagram](./data/Kanvas_UML_1.png)