import { DocumentoVisitor } from "./DocumentoVisitor";

export class Excel {
    size: number;

    constructor(size: number) {
        this.size = size;
    }

    accept(visitor: DocumentoVisitor): void {
        visitor.visitExcel(this);
    }
}