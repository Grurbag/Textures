// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelVampirePirateHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer hat;
	private final ModelRenderer hat_r1;
	private final ModelRenderer hat_r2;
	private final ModelRenderer hat_r3;
	private final ModelRenderer hat_r4;
	private final ModelRenderer hat_r5;
	private final ModelRenderer hat_r6;
	private final ModelRenderer hat_r7;
	private final ModelRenderer hat_r8;
	private final ModelRenderer hat2;
	private final ModelRenderer hat_r9;
	private final ModelRenderer hat_r10;
	private final ModelRenderer hat_r11;
	private final ModelRenderer hat_r12;
	private final ModelRenderer hat_r13;
	private final ModelRenderer hat_r14;
	private final ModelRenderer hat_r15;
	private final ModelRenderer hat_r16;

	public WFMModelVampirePirateHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.75F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

		hat = new ModelRenderer(this);
		hat.setPos(0.0F, -5.0F, -8.0F);
		head.addChild(hat);
		setRotationAngle(hat, 0.0F, -0.48F, 0.0F);
		

		hat_r1 = new ModelRenderer(this);
		hat_r1.setPos(0.0F, 0.0F, 0.0F);
		hat.addChild(hat_r1);
		setRotationAngle(hat_r1, 1.5708F, -2.138F, 0.0F);
		hat_r1.texOffs(0, 35).addBox(0.0F, -9.0F, 0.0F, 6.0F, 9.0F, 0.0F, 0.0F, false);

		hat_r2 = new ModelRenderer(this);
		hat_r2.setPos(-3.2238F, 0.0F, 5.0603F);
		hat.addChild(hat_r2);
		setRotationAngle(hat_r2, -1.5708F, -1.2654F, -3.1416F);
		hat_r2.texOffs(12, 35).addBox(0.0F, -9.0F, 0.0F, 7.0F, 9.0F, 0.0F, 0.0F, false);

		hat_r3 = new ModelRenderer(this);
		hat_r3.setPos(5.9943F, 0.0F, 0.2617F);
		hat.addChild(hat_r3);
		setRotationAngle(hat_r3, -1.5272F, -0.3054F, 0.0F);
		hat_r3.texOffs(12, 35).addBox(0.0F, -9.0F, 0.0F, 7.0F, 9.0F, 0.0F, 0.0F, false);

		hat_r4 = new ModelRenderer(this);
		hat_r4.setPos(0.0F, 0.0F, 0.0F);
		hat.addChild(hat_r4);
		setRotationAngle(hat_r4, -1.5708F, -0.0436F, 0.0F);
		hat_r4.texOffs(0, 35).addBox(0.0F, -9.0F, 0.0F, 6.0F, 9.0F, 0.0F, 0.0F, false);

		hat_r5 = new ModelRenderer(this);
		hat_r5.setPos(0.0F, 0.0F, 0.0F);
		hat.addChild(hat_r5);
		setRotationAngle(hat_r5, 0.0F, -0.0436F, 0.0F);
		hat_r5.texOffs(38, 55).addBox(-0.5F, -9.0F, -0.866F, 6.0F, 9.0F, 0.0F, 0.0F, false);
		hat_r5.texOffs(0, 55).addBox(0.0F, -9.0F, 0.0F, 6.0F, 9.0F, 0.0F, 0.0F, false);

		hat_r6 = new ModelRenderer(this);
		hat_r6.setPos(5.9943F, 0.0F, 0.2617F);
		hat.addChild(hat_r6);
		setRotationAngle(hat_r6, 0.0F, -0.3054F, 0.0F);
		hat_r6.texOffs(50, 55).addBox(-0.7071F, -9.0F, -0.7071F, 7.0F, 9.0F, 0.0F, 0.0F, false);
		hat_r6.texOffs(12, 55).addBox(0.0F, -9.0F, 0.0F, 7.0F, 9.0F, 0.0F, 0.0F, false);

		hat_r7 = new ModelRenderer(this);
		hat_r7.setPos(0.0F, 0.0F, 0.0F);
		hat.addChild(hat_r7);
		setRotationAngle(hat_r7, 0.0F, -2.138F, 0.0F);
		hat_r7.texOffs(38, 55).addBox(-0.5F, -9.0F, 0.866F, 6.0F, 9.0F, 0.0F, 0.0F, false);
		hat_r7.texOffs(0, 55).addBox(0.0F, -9.0F, 0.0F, 6.0F, 9.0F, 0.0F, 0.0F, false);

		hat_r8 = new ModelRenderer(this);
		hat_r8.setPos(-3.2238F, 0.0F, 5.0603F);
		hat.addChild(hat_r8);
		setRotationAngle(hat_r8, 0.0F, -1.8762F, 0.0F);
		hat_r8.texOffs(50, 55).addBox(-0.7071F, -9.0F, 0.7071F, 7.0F, 9.0F, 0.0F, 0.0F, false);
		hat_r8.texOffs(12, 55).addBox(0.0F, -9.0F, 0.0F, 7.0F, 9.0F, 0.0F, 0.0F, false);

		hat2 = new ModelRenderer(this);
		hat2.setPos(0.0F, -5.0F, 8.0F);
		head.addChild(hat2);
		setRotationAngle(hat2, 0.0F, 2.6616F, 0.0F);
		

		hat_r9 = new ModelRenderer(this);
		hat_r9.setPos(0.0F, 0.0F, 0.0F);
		hat2.addChild(hat_r9);
		setRotationAngle(hat_r9, 0.0F, -0.0436F, 0.0F);
		hat_r9.texOffs(38, 44).addBox(-0.5F, -9.0F, -0.866F, 6.0F, 9.0F, 0.0F, 0.0F, false);
		hat_r9.texOffs(0, 44).addBox(0.0F, -9.0F, 0.0F, 6.0F, 9.0F, 0.0F, 0.0F, false);

		hat_r10 = new ModelRenderer(this);
		hat_r10.setPos(5.9943F, 0.0F, 0.2617F);
		hat2.addChild(hat_r10);
		setRotationAngle(hat_r10, 0.0F, -0.3054F, 0.0F);
		hat_r10.texOffs(50, 44).addBox(-0.7071F, -9.0F, -0.7071F, 7.0F, 9.0F, 0.0F, 0.0F, false);
		hat_r10.texOffs(12, 44).addBox(0.0F, -9.0F, 0.0F, 7.0F, 9.0F, 0.0F, 0.0F, false);

		hat_r11 = new ModelRenderer(this);
		hat_r11.setPos(0.0F, 0.0F, 0.0F);
		hat2.addChild(hat_r11);
		setRotationAngle(hat_r11, 0.0F, -2.138F, 0.0F);
		hat_r11.texOffs(38, 44).addBox(-0.5F, -9.0F, 0.866F, 6.0F, 9.0F, 0.0F, 0.0F, false);
		hat_r11.texOffs(0, 44).addBox(0.0F, -9.0F, 0.0F, 6.0F, 9.0F, 0.0F, 0.0F, false);

		hat_r12 = new ModelRenderer(this);
		hat_r12.setPos(-3.2238F, 0.0F, 5.0603F);
		hat2.addChild(hat_r12);
		setRotationAngle(hat_r12, 0.0F, -1.8762F, 0.0F);
		hat_r12.texOffs(50, 44).addBox(-0.7071F, -9.0F, 0.7071F, 7.0F, 9.0F, 0.0F, 0.0F, false);
		hat_r12.texOffs(12, 44).addBox(0.0F, -9.0F, 0.0F, 7.0F, 9.0F, 0.0F, 0.0F, false);

		hat_r13 = new ModelRenderer(this);
		hat_r13.setPos(-3.2238F, 0.0F, 5.0603F);
		hat2.addChild(hat_r13);
		setRotationAngle(hat_r13, 1.5708F, -1.8762F, 0.0F);
		hat_r13.texOffs(12, 35).addBox(0.0F, -9.0F, 0.0F, 7.0F, 9.0F, 0.0F, 0.0F, false);

		hat_r14 = new ModelRenderer(this);
		hat_r14.setPos(0.0F, 0.0F, 0.0F);
		hat2.addChild(hat_r14);
		setRotationAngle(hat_r14, 1.5708F, -2.138F, 0.0F);
		hat_r14.texOffs(0, 35).addBox(0.0F, -9.0F, 0.0F, 6.0F, 9.0F, 0.0F, 0.0F, false);

		hat_r15 = new ModelRenderer(this);
		hat_r15.setPos(5.9943F, 0.0F, 0.2617F);
		hat2.addChild(hat_r15);
		setRotationAngle(hat_r15, -1.5708F, -0.3054F, 0.0F);
		hat_r15.texOffs(12, 35).addBox(0.0F, -9.0F, 0.0F, 7.0F, 9.0F, 0.0F, 0.0F, false);

		hat_r16 = new ModelRenderer(this);
		hat_r16.setPos(0.0F, 0.0F, 0.0F);
		hat2.addChild(hat_r16);
		setRotationAngle(hat_r16, -1.5708F, -0.0436F, 0.0F);
		hat_r16.texOffs(0, 35).addBox(0.0F, -9.0F, 0.0F, 6.0F, 9.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}