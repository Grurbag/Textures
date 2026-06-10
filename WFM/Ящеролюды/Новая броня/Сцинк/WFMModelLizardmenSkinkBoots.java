// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelLizardmenSkinkBoots extends EntityModel<Entity> {
	private final ModelRenderer leftBoot;
	private final ModelRenderer leftLeg9;
	private final ModelRenderer leftLeg10;
	private final ModelRenderer leftLeg11;
	private final ModelRenderer rightBoot;
	private final ModelRenderer rightLeg4;
	private final ModelRenderer rightLeg8;
	private final ModelRenderer rightLeg9;

	public WFMModelLizardmenSkinkBoots() {
		texWidth = 128;
		texHeight = 64;

		leftBoot = new ModelRenderer(this);
		leftBoot.setPos(1.0F, 10.0F, -0.5F);
		

		leftLeg9 = new ModelRenderer(this);
		leftLeg9.setPos(0.0F, 0.0F, 0.0F);
		leftBoot.addChild(leftLeg9);
		setRotationAngle(leftLeg9, -0.7418F, 0.0F, 0.0F);
		leftLeg9.texOffs(2, 14).addBox(-0.5F, -1.0F, -0.5F, 4.0F, 7.0F, 3.0F, 0.0F, false);

		leftLeg10 = new ModelRenderer(this);
		leftLeg10.setPos(2.0F, 3.0F, 0.0F);
		leftLeg9.addChild(leftLeg10);
		setRotationAngle(leftLeg10, 1.4835F, 0.0F, 0.0F);
		leftLeg10.texOffs(2, 27).addBox(-2.1F, 1.0F, -2.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		leftLeg11 = new ModelRenderer(this);
		leftLeg11.setPos(0.0F, 7.0F, 0.0F);
		leftLeg10.addChild(leftLeg11);
		setRotationAngle(leftLeg11, -0.6981F, 0.0F, 0.0F);
		leftLeg11.texOffs(1, 40).addBox(-1.5F, 0.0F, -2.5F, 2.0F, 5.0F, 2.0F, 0.3F, false);
		leftLeg11.texOffs(9, 40).addBox(-1.5F, 0.0F, -2.5F, 2.0F, 5.0F, 2.0F, 0.5F, false);

		rightBoot = new ModelRenderer(this);
		rightBoot.setPos(-1.0F, 10.0F, -0.5F);
		

		rightLeg4 = new ModelRenderer(this);
		rightLeg4.setPos(0.0F, 0.0F, 0.0F);
		rightBoot.addChild(rightLeg4);
		setRotationAngle(rightLeg4, -0.7418F, 0.0F, 0.0F);
		rightLeg4.texOffs(2, 14).addBox(-3.5F, -1.0F, -0.5F, 4.0F, 7.0F, 3.0F, 0.0F, true);

		rightLeg8 = new ModelRenderer(this);
		rightLeg8.setPos(-2.0F, 3.0F, 0.0F);
		rightLeg4.addChild(rightLeg8);
		setRotationAngle(rightLeg8, 1.4835F, 0.0F, 0.0F);
		rightLeg8.texOffs(2, 27).addBox(-0.9F, 1.0F, -2.5F, 3.0F, 7.0F, 3.0F, 0.0F, true);

		rightLeg9 = new ModelRenderer(this);
		rightLeg9.setPos(0.0F, 7.0F, 0.0F);
		rightLeg8.addChild(rightLeg9);
		setRotationAngle(rightLeg9, -0.6981F, 0.0F, 0.0F);
		rightLeg9.texOffs(1, 40).addBox(-0.5F, 0.0F, -2.5F, 2.0F, 5.0F, 2.0F, 0.3F, true);
		rightLeg9.texOffs(9, 40).addBox(-0.5F, 0.0F, -2.5F, 2.0F, 5.0F, 2.0F, 0.5F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		leftBoot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightBoot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}