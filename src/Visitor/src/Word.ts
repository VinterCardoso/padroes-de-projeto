import { DocumentoVisitor } from "./DocumentoVisitor";

export class Word {
    size: number;

    constructor(size: number) {
        this.size = size;
    }

    accept(visitor: DocumentoVisitor): void {
        visitor.visitWord(this);
    }
}