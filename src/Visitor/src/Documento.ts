import { DocumentoVisitor } from "./DocumentoVisitor";

export abstract class Documento {
    abstract accept(visitor: DocumentoVisitor): void;
}