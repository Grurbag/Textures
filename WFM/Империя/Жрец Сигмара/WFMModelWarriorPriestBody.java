// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelWarriorPriestBody extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer LeftArm_r2;
	private final ModelRenderer shoulder;
	private final ModelRenderer shoulderRight_r1;
	private final ModelRenderer shoulderRight_r2;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer RightArm_r2;
	private final ModelRenderer shoulderRight;
	private final ModelRenderer shoulderRight_r3;
	private final ModelRenderer shoulderRight_r4;

	public WFMModelWarriorPriestBody() {
		texWidth = 64;
		texHeight = 64;

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		Body.texOffs(46, 55).addBox(-4.5F, 1.0F, -3.0F, 9.0F, 9.0F, 0.0F, 0.0F, false);
		Body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		RightArm.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		RightArm.texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);
		RightArm.texOffs(0, 29).addBox(-1.2479F, 0.0326F, -3.5F, 3.0F, 8.0F, 0.0F, 0.0F, false);
		RightArm.texOffs(23, 27).addBox(-4.0F, -1.0F, -2.5F, 0.0F, 12.0F, 5.0F, 0.0F, false);

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setPos(-1.1061F, 0.81F, 0.0F);
		RightArm.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.0F, 0.0F, -0.0436F);
		LeftArm_r1.texOffs(40, 0).addBox(-3.0F, -3.5F, -3.0F, 6.0F, 7.0F, 6.0F, -0.15F, false);

		LeftArm_r2 = new ModelRenderer(this);
		LeftArm_r2.setPos(-1.2479F, -0.4674F, 0.0F);
		RightArm.addChild(LeftArm_r2);
		setRotationAngle(LeftArm_r2, 0.0F, 0.0F, -0.1309F);
		LeftArm_r2.texOffs(40, 32).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.1F, false);
		LeftArm_r2.texOffs(40, 43).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.3F, false);

		shoulder = new ModelRenderer(this);
		shoulder.setPos(-0.9914F, -2.8715F, -0.0229F);
		RightArm.addChild(shoulder);
		setRotationAngle(shoulder, 0.0046F, -0.0229F, -0.1289F);
		shoulder.texOffs(0, 44).addBox(-1.0F, -4.0F, -3.9769F, 1.0F, 8.0F, 8.0F, 0.0F, true);

		shoulderRight_r1 = new ModelRenderer(this);
		shoulderRight_r1.setPos(-3.4277F, 0.5715F, 0.3158F);
		shoulder.addChild(shoulderRight_r1);
		setRotationAngle(shoulderRight_r1, -3.1416F, 0.0F, 2.3562F);
		shoulderRight_r1.texOffs(18, 44).addBox(-0.5F, -1.5F, -4.0029F, 1.0F, 6.0F, 8.0F, 0.0F, true);

		shoulderRight_r2 = new ModelRenderer(this);
		shoulderRight_r2.setPos(-3.4277F, 4.5715F, 0.3158F);
		shoulder.addChild(shoulderRight_r2);
		setRotationAngle(shoulderRight_r2, 3.1416F, 0.0F, 1.5708F);
		shoulderRight_r2.texOffs(0, 29).addBox(-0.5F, -1.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, true);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		LeftArm.texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, true);
		LeftArm.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, true);
		LeftArm.texOffs(23, 27).addBox(4.0F, -1.0F, -2.5F, 0.0F, 12.0F, 5.0F, 0.0F, true);
		LeftArm.texOffs(58, 0).addBox(-2.2479F, 0.0326F, -3.5F, 3.0F, 3.0F, 0.0F, 0.0F, true);

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setPos(1.1061F, 0.81F, 0.0F);
		LeftArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, 0.0436F);
		RightArm_r1.texOffs(40, 0).addBox(-3.0F, -3.5F, -3.0F, 6.0F, 7.0F, 6.0F, -0.15F, true);

		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setPos(1.0F, -0.5F, 0.0F);
		LeftArm.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.0F, 0.0F, 0.1309F);
		RightArm_r2.texOffs(40, 43).addBox(-2.75F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.3F, true);
		RightArm_r2.texOffs(40, 32).addBox(-2.75F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.1F, true);

		shoulderRight = new ModelRenderer(this);
		shoulderRight.setPos(2.0809F, -3.2741F, 0.2698F);
		LeftArm.addChild(shoulderRight);
		setRotationAngle(shoulderRight, 0.0046F, -0.0229F, 0.0893F);
		shoulderRight.texOffs(0, 44).addBox(-1.0F, -3.5259F, -3.9769F, 1.0F, 8.0F, 8.0F, 0.0F, false);

		shoulderRight_r3 = new ModelRenderer(this);
		shoulderRight_r3.setPos(2.5F, 0.9741F, 0.0231F);
		shoulderRight.addChild(shoulderRight_r3);
		setRotationAngle(shoulderRight_r3, 0.0F, 0.0F, 0.7854F);
		shoulderRight_r3.texOffs(18, 44).addBox(-0.5F, -1.5F, -4.0029F, 1.0F, 6.0F, 8.0F, 0.0F, false);

		shoulderRight_r4 = new ModelRenderer(this);
		shoulderRight_r4.setPos(2.5F, 4.9741F, 0.0231F);
		shoulderRight.addChild(shoulderRight_r4);
		setRotationAngle(shoulderRight_r4, 0.0F, 0.0F, 1.6581F);
		shoulderRight_r4.texOffs(0, 29).addBox(-0.1809F, -1.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
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