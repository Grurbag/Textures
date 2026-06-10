// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelFimirBoots extends EntityModel<Entity> {
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLeg8;
	private final ModelRenderer rightLeg9;
	private final ModelRenderer rightLeg10;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLeg11;
	private final ModelRenderer leftLeg12;
	private final ModelRenderer leftLeg13;

	public WFMModelFimirBoots() {
		texWidth = 128;
		texHeight = 64;

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.0F, 10.0F, -0.5F);
		

		rightLeg8 = new ModelRenderer(this);
		rightLeg8.setPos(0.0F, 0.0F, 0.0F);
		rightLeg.addChild(rightLeg8);
		setRotationAngle(rightLeg8, -0.7418F, 0.0F, 0.0F);
		rightLeg8.texOffs(0, 18).addBox(-5.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, true);

		rightLeg9 = new ModelRenderer(this);
		rightLeg9.setPos(-2.0F, 3.0F, 0.0F);
		rightLeg8.addChild(rightLeg9);
		setRotationAngle(rightLeg9, 1.4835F, 0.0F, 0.0F);
		rightLeg9.texOffs(1, 32).addBox(-1.9F, -1.0F, -2.5F, 4.0F, 9.0F, 4.0F, 0.0F, true);

		rightLeg10 = new ModelRenderer(this);
		rightLeg10.setPos(0.0F, 7.0F, 0.0F);
		rightLeg9.addChild(rightLeg10);
		setRotationAngle(rightLeg10, -0.6981F, 0.0F, 0.0F);
		rightLeg10.texOffs(0, 45).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 6.0F, 3.0F, 0.3F, true);
		rightLeg10.texOffs(12, 45).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 6.0F, 3.0F, 0.51F, true);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(1.0F, 10.0F, -0.5F);
		

		leftLeg11 = new ModelRenderer(this);
		leftLeg11.setPos(0.0F, 0.0F, 0.0F);
		leftLeg.addChild(leftLeg11);
		setRotationAngle(leftLeg11, -0.7418F, 0.0F, 0.0F);
		leftLeg11.texOffs(0, 18).addBox(0.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, false);

		leftLeg12 = new ModelRenderer(this);
		leftLeg12.setPos(2.0F, 3.0F, 0.0F);
		leftLeg11.addChild(leftLeg12);
		setRotationAngle(leftLeg12, 1.4835F, 0.0F, 0.0F);
		leftLeg12.texOffs(1, 32).addBox(-2.1F, -1.0F, -2.5F, 4.0F, 9.0F, 4.0F, 0.0F, false);

		leftLeg13 = new ModelRenderer(this);
		leftLeg13.setPos(0.0F, 7.0F, 0.0F);
		leftLeg12.addChild(leftLeg13);
		setRotationAngle(leftLeg13, -0.6981F, 0.0F, 0.0F);
		leftLeg13.texOffs(0, 45).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 6.0F, 3.0F, 0.3F, false);
		leftLeg13.texOffs(12, 45).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 6.0F, 3.0F, 0.51F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}