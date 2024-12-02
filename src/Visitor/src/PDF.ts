import { Documento } from "./Documento";
import { DocumentoVisitor } from "./DocumentoVisitor";

export class PDF implements Documento {
    size: number;

    constructor(size: number) {
        this.size = size;
    }

    accept(visitor: DocumentoVisitor): void {
        visitor.visitPDF(this);
    }
}