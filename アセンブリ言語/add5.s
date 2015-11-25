	.file	"add5.c"
	.text
	.globl	add5
	.def	add5;	.scl	2;	.type	32;	.endef
	.seh_proc	add5
add5:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movl	%ecx, 16(%rbp)
	movl	16(%rbp), %eax
	addl	$5, %eax
	popq	%rbp
	ret
	.seh_endproc
	.ident	"GCC: (GNU) 4.9.2"
