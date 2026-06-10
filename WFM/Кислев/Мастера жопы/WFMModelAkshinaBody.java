// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelAkshinaBody extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Head_r2;
	private final ModelRenderer Head_r3;
	private final ModelRenderer Head_r4;
	private final ModelRenderer Head_r5;
	private final ModelRenderer Head_r6;
	private final ModelRenderer Head_r7;
	private final ModelRenderer Head_r8;
	private final ModelRenderer Head_r9;
	private final ModelRenderer Head_r10;
	private final ModelRenderer cape;
	private final ModelRenderer Cloak_r1;
	private final ModelRenderer RightArm;
	private final ModelRenderer rightarm_r1;
	private final ModelRenderer LeftArm;
	private final ModelRenderer leftarm_r1;

	public WFMModelAkshinaBody() {
		texWidth = 64;
		texHeight = 64;

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		Body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);

		Head_r1 = new ModelRenderer(this);
		Head_r1.setPos(7.0F, 2.0F, 5.75F);
		Body.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.0412F, -0.0374F, 0.1254F);
		Head_r1.texOffs(62, 45).addBox(0.0F, 2.0F, -0.75F, 1.0F, 2.0F, 0.0F, 0.0F, false);

		Head_r2 = new ModelRenderer(this);
		Head_r2.setPos(5.0F, 2.0F, 5.75F);
		Body.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0848F, -0.0374F, 0.1254F);
		Head_r2.texOffs(62, 45).addBox(0.5F, 2.0F, -0.75F, 1.0F, 2.0F, 0.0F, 0.0F, false);

		Head_r3 = new ModelRenderer(this);
		Head_r3.setPos(4.0F, 2.0F, 5.75F);
		Body.addChild(Head_r3);
		setRotationAngle(Head_r3, 0.1285F, -0.0374F, 0.1254F);
		Head_r3.texOffs(62, 45).addBox(0.0F, 1.3F, -0.75F, 1.0F, 2.0F, 0.0F, 0.0F, false);

		Head_r4 = new ModelRenderer(this);
		Head_r4.setPos(-7.0F, 2.0F, 5.75F);
		Body.addChild(Head_r4);
		setRotationAngle(Head_r4, 0.0412F, 0.0374F, -0.1254F);
		Head_r4.texOffs(62, 45).addBox(-1.0F, 2.0F, -0.75F, 1.0F, 2.0F, 0.0F, 0.0F, true);

		Head_r5 = new ModelRenderer(this);
		Head_r5.setPos(-5.0F, 2.0F, 5.75F);
		Body.addChild(Head_r5);
		setRotationAngle(Head_r5, 0.0848F, 0.0374F, -0.1254F);
		Head_r5.texOffs(62, 45).addBox(-1.5F, 2.0F, -0.75F, 1.0F, 2.0F, 0.0F, 0.0F, true);

		Head_r6 = new ModelRenderer(this);
		Head_r6.setPos(-4.0F, 0.0F, 4.75F);
		Body.addChild(Head_r6);
		setRotationAngle(Head_r6, 0.1791F, 0.5964F, -0.4107F);
		Head_r6.texOffs(62, 45).addBox(-1.0F, 2.0F, -0.75F, 1.0F, 2.0F, 0.0F, 0.0F, true);

		Head_r7 = new ModelRenderer(this);
		Head_r7.setPos(4.0F, 0.0F, 4.75F);
		Body.addChild(Head_r7);
		setRotationAngle(Head_r7, 0.1791F, -0.5964F, 0.4107F);
		Head_r7.texOffs(62, 45).addBox(0.0F, 2.0F, -0.75F, 1.0F, 2.0F, 0.0F, 0.0F, false);

		Head_r8 = new ModelRenderer(this);
		Head_r8.setPos(-4.0F, 2.0F, 5.75F);
		Body.addChild(Head_r8);
		setRotationAngle(Head_r8, 0.1285F, 0.0374F, -0.1254F);
		Head_r8.texOffs(62, 45).addBox(-1.0F, 1.3F, -0.75F, 1.0F, 2.0F, 0.0F, 0.0F, true);

		Head_r9 = new ModelRenderer(this);
		Head_r9.setPos(8.0F, -3.0F, 5.75F);
		Body.addChild(Head_r9);
		setRotationAngle(Head_r9, 0.2594F, -0.0374F, 0.1254F);
		Head_r9.texOffs(49, 35).addBox(-4.0F, 2.0F, -3.75F, 5.0F, 5.0F, 2.0F, 0.0F, false);

		Head_r10 = new ModelRenderer(this);
		Head_r10.setPos(-6.0F, -3.0F, 5.75F);
		Body.addChild(Head_r10);
		setRotationAngle(Head_r10, 0.2594F, 0.0374F, -0.1254F);
		Head_r10.texOffs(49, 35).addBox(-3.0F, 2.0F, -3.75F, 5.0F, 5.0F, 2.0F, 0.0F, false);

		cape = new ModelRenderer(this);
		cape.setPos(0.0F, 0.0F, 3.25F);
		Body.addChild(cape);
		

		Cloak_r1 = new ModelRenderer(this);
		Cloak_r1.setPos(0.0F, 0.0F, -0.5F);
		cape.addChild(Cloak_r1);
		setRotationAngle(Cloak_r1, 0.0873F, 0.0F, 0.0F);
		Cloak_r1.texOffs(0, 40).addBox(-6.0F, 0.0F, 0.0F, 12.0F, 24.0F, 0.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		RightArm.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, true);
		RightArm.texOffs(40, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.79F, true);

		rightarm_r1 = new ModelRenderer(this);
		rightarm_r1.setPos(-1.5F, -1.0F, 0.0F);
		RightArm.addChild(rightarm_r1);
		setRotationAngle(rightarm_r1, 0.0F, 0.0F, -0.2182F);
		rightarm_r1.texOffs(36, 51).addBox(-3.75F, -2.5F, -3.5F, 7.0F, 6.0F, 7.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		LeftArm.texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		LeftArm.texOffs(40, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.79F, false);

		leftarm_r1 = new ModelRenderer(this);
		leftarm_r1.setPos(1.5F, -1.0F, 0.0F);
		LeftArm.addChild(leftarm_r1);
		setRotationAngle(leftarm_r1, 0.0F, 0.0F, 0.2182F);
		leftarm_r1.texOffs(36, 51).addBox(-3.25F, -2.5F, -3.5F, 7.0F, 6.0F, 7.0F, 0.0F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}