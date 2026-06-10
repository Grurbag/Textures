// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelBlackGuardHelmet extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer hair_r1;
	private final ModelRenderer hair_r2;
	private final ModelRenderer hair_r3;
	private final ModelRenderer hair_r4;
	private final ModelRenderer hair_r5;
	private final ModelRenderer hair_r6;
	private final ModelRenderer hair_r7;
	private final ModelRenderer hair_r8;
	private final ModelRenderer hornRight_r1;
	private final ModelRenderer hornRight_r2;
	private final ModelRenderer hornRight_r3;

	public WFMModelBlackGuardHelmet() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, -1.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.75F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 10.0F, 8.0F, 1.0F, false);
		Head.texOffs(32, 18).addBox(-4.0F, -12.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);
		Head.texOffs(35, 28).addBox(-3.0F, -14.0F, -3.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);
		Head.texOffs(39, 36).addBox(-2.0F, -15.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		Head.texOffs(42, 41).addBox(-1.0F, -16.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Head.texOffs(4, 55).addBox(-4.5F, -4.0F, -5.2F, 9.0F, 9.0F, 0.0F, 0.0F, false);
		Head.texOffs(52, 59).addBox(4.0F, -9.0F, 0.0F, 6.0F, 5.0F, 0.0F, 0.0F, false);
		Head.texOffs(52, 54).addBox(3.0F, -13.0F, 0.0F, 6.0F, 5.0F, 0.0F, 0.0F, false);
		Head.texOffs(52, 49).addBox(1.0F, -18.0F, 0.0F, 6.0F, 5.0F, 0.0F, 0.0F, false);

		hair_r1 = new ModelRenderer(this);
		hair_r1.setPos(0.0F, -16.0F, 0.0F);
		Head.addChild(hair_r1);
		setRotationAngle(hair_r1, 0.0F, -1.0908F, 0.0F);
		hair_r1.texOffs(0, 18).addBox(-2.0F, -6.0F, 0.0F, 15.0F, 29.0F, 0.0F, 0.0F, false);

		hair_r2 = new ModelRenderer(this);
		hair_r2.setPos(0.0F, -16.0F, 0.0F);
		Head.addChild(hair_r2);
		setRotationAngle(hair_r2, 0.0F, -1.0472F, 0.0F);
		hair_r2.texOffs(0, 18).addBox(-2.0F, -6.0F, 0.0F, 15.0F, 29.0F, 0.0F, 0.0F, false);

		hair_r3 = new ModelRenderer(this);
		hair_r3.setPos(0.0F, -16.0F, 0.0F);
		Head.addChild(hair_r3);
		setRotationAngle(hair_r3, 0.0F, -1.0036F, 0.0F);
		hair_r3.texOffs(0, 18).addBox(-2.0F, -6.0F, 0.0F, 15.0F, 29.0F, 0.0F, 0.0F, false);

		hair_r4 = new ModelRenderer(this);
		hair_r4.setPos(0.0F, -16.0F, 0.0F);
		Head.addChild(hair_r4);
		setRotationAngle(hair_r4, 0.0F, -0.9599F, 0.0F);
		hair_r4.texOffs(0, 18).addBox(-2.0F, -6.0F, 0.0F, 15.0F, 29.0F, 0.0F, 0.0F, false);

		hair_r5 = new ModelRenderer(this);
		hair_r5.setPos(0.0F, -16.0F, 0.0F);
		Head.addChild(hair_r5);
		setRotationAngle(hair_r5, 0.0F, -0.9163F, 0.0F);
		hair_r5.texOffs(0, 18).addBox(-2.0F, -6.0F, 0.0F, 15.0F, 29.0F, 0.0F, 0.0F, false);

		hair_r6 = new ModelRenderer(this);
		hair_r6.setPos(0.0F, -16.0F, 0.0F);
		Head.addChild(hair_r6);
		setRotationAngle(hair_r6, 0.0F, -0.8727F, 0.0F);
		hair_r6.texOffs(0, 18).addBox(-2.0F, -6.0F, 0.0F, 15.0F, 29.0F, 0.0F, 0.0F, false);

		hair_r7 = new ModelRenderer(this);
		hair_r7.setPos(0.0F, -16.0F, 0.0F);
		Head.addChild(hair_r7);
		setRotationAngle(hair_r7, 0.0F, -0.829F, 0.0F);
		hair_r7.texOffs(0, 18).addBox(-2.0F, -6.0F, 0.0F, 15.0F, 29.0F, 0.0F, 0.0F, false);

		hair_r8 = new ModelRenderer(this);
		hair_r8.setPos(0.0F, -16.0F, 0.0F);
		Head.addChild(hair_r8);
		setRotationAngle(hair_r8, 0.0F, -0.7854F, 0.0F);
		hair_r8.texOffs(0, 18).addBox(-2.0F, -6.0F, 0.0F, 15.0F, 29.0F, 0.0F, 0.0F, false);

		hornRight_r1 = new ModelRenderer(this);
		hornRight_r1.setPos(-4.0F, -15.5F, 0.0F);
		Head.addChild(hornRight_r1);
		setRotationAngle(hornRight_r1, 0.0F, 3.1416F, 0.0F);
		hornRight_r1.texOffs(52, 49).addBox(-3.0F, -2.5F, 0.0F, 6.0F, 5.0F, 0.0F, 0.0F, false);

		hornRight_r2 = new ModelRenderer(this);
		hornRight_r2.setPos(-6.0F, -10.5F, 0.0F);
		Head.addChild(hornRight_r2);
		setRotationAngle(hornRight_r2, 0.0F, 3.1416F, 0.0F);
		hornRight_r2.texOffs(52, 54).addBox(-3.0F, -2.5F, 0.0F, 6.0F, 5.0F, 0.0F, 0.0F, false);

		hornRight_r3 = new ModelRenderer(this);
		hornRight_r3.setPos(-7.0F, -6.5F, 0.0F);
		Head.addChild(hornRight_r3);
		setRotationAngle(hornRight_r3, 0.0F, 3.1416F, 0.0F);
		hornRight_r3.texOffs(52, 59).addBox(-3.0F, -2.5F, 0.0F, 6.0F, 5.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}