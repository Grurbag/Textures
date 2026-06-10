// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelKislevIceGuardBody extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer tits;
	private final ModelRenderer titRight;
	private final ModelRenderer titLeft;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer RightArm;
	private final ModelRenderer RightArm_r2;

	public WFMModelKislevIceGuardBody() {
		texWidth = 64;
		texHeight = 64;

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		Body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);

		tits = new ModelRenderer(this);
		tits.setPos(-3.0F, 3.0F, -2.0F);
		Body.addChild(tits);
		

		titRight = new ModelRenderer(this);
		titRight.setPos(0.5F, 0.5F, -0.5F);
		tits.addChild(titRight);
		setRotationAngle(titRight, 0.0F, 0.7854F, 0.0F);
		titRight.texOffs(0, 52).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.1F, false);
		titRight.texOffs(19, 52).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.3F, false);
		titRight.texOffs(13, 52).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		titRight.texOffs(11, 55).addBox(-1.0F, 1.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		titLeft = new ModelRenderer(this);
		titLeft.setPos(5.5F, 0.5F, -0.5F);
		tits.addChild(titLeft);
		setRotationAngle(titLeft, 0.0F, 0.7854F, 0.0F);
		titLeft.texOffs(0, 58).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.1F, false);
		titLeft.texOffs(19, 58).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.3F, false);
		titLeft.texOffs(13, 58).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		titLeft.texOffs(11, 61).addBox(-1.0F, 1.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		LeftArm.texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, true);
		LeftArm.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, true);

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setPos(1.0F, -0.5F, 0.0F);
		LeftArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, 0.1309F);
		RightArm_r1.texOffs(40, 32).addBox(-2.75F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.1F, false);
		RightArm_r1.texOffs(40, 0).addBox(-2.75F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, -0.15F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		RightArm.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		RightArm.texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);

		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setPos(-1.0F, -0.5F, 0.0F);
		RightArm.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.0F, 0.0F, -0.1309F);
		RightArm_r2.texOffs(40, 0).addBox(-3.25F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, -0.15F, true);
		RightArm_r2.texOffs(40, 32).addBox(-3.25F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.1F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}