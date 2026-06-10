// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelSkavenBoots extends EntityModel<Entity> {
	private final ModelRenderer rightBoot;
	private final ModelRenderer rightLeg_r1;
	private final ModelRenderer rightLeg_r2;
	private final ModelRenderer leftBoot;
	private final ModelRenderer leftLeg_r1;
	private final ModelRenderer leftLeg_r2;

	public WFMModelSkavenBoots() {
		texWidth = 64;
		texHeight = 64;

		rightBoot = new ModelRenderer(this);
		rightBoot.setPos(-3.0F, 12.0F, 0.0F);
		setRotationAngle(rightBoot, 0.1745F, 0.0F, 0.0F);
		

		rightLeg_r1 = new ModelRenderer(this);
		rightLeg_r1.setPos(0.0F, 11.606F, -3.9278F);
		rightBoot.addChild(rightLeg_r1);
		setRotationAngle(rightLeg_r1, -0.1745F, 0.0F, 0.0F);
		rightLeg_r1.texOffs(0, 36).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 1.0F, 4.0F, 0.25F, true);

		rightLeg_r2 = new ModelRenderer(this);
		rightLeg_r2.setPos(-0.1F, 5.0F, -3.0F);
		rightBoot.addChild(rightLeg_r2);
		setRotationAngle(rightLeg_r2, 0.0873F, 0.0F, 0.0F);
		rightLeg_r2.texOffs(0, 25).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, -0.25F, true);

		leftBoot = new ModelRenderer(this);
		leftBoot.setPos(3.0F, 12.0F, 0.0F);
		setRotationAngle(leftBoot, 0.1745F, 0.0F, 0.0F);
		

		leftLeg_r1 = new ModelRenderer(this);
		leftLeg_r1.setPos(0.0F, 11.606F, -3.9278F);
		leftBoot.addChild(leftLeg_r1);
		setRotationAngle(leftLeg_r1, -0.1745F, 0.0F, 0.0F);
		leftLeg_r1.texOffs(0, 36).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 1.0F, 4.0F, 0.25F, false);

		leftLeg_r2 = new ModelRenderer(this);
		leftLeg_r2.setPos(-0.1F, 5.0F, -3.0F);
		leftBoot.addChild(leftLeg_r2);
		setRotationAngle(leftLeg_r2, 0.0873F, 0.0F, 0.0F);
		leftLeg_r2.texOffs(0, 25).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, -0.25F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		rightBoot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftBoot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}