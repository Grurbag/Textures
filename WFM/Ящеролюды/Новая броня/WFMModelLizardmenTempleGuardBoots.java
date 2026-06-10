// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelLizardmenTempleGuardBoots extends EntityModel<Entity> {
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLeg9;
	private final ModelRenderer leftLeg10;
	private final ModelRenderer leftLeg11;
	private final ModelRenderer fang2;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLeg4;
	private final ModelRenderer rightLeg8;
	private final ModelRenderer rightLeg9;
	private final ModelRenderer fang;

	public WFMModelLizardmenTempleGuardBoots() {
		texWidth = 128;
		texHeight = 128;

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(1.0F, 10.0F, -0.5F);
		

		leftLeg9 = new ModelRenderer(this);
		leftLeg9.setPos(0.0F, 0.0F, 0.0F);
		leftLeg.addChild(leftLeg9);
		setRotationAngle(leftLeg9, -0.7418F, 0.0F, 0.0F);
		leftLeg9.texOffs(0, 12).addBox(0.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.5F, false);

		leftLeg10 = new ModelRenderer(this);
		leftLeg10.setPos(2.0F, 3.0F, 0.0F);
		leftLeg9.addChild(leftLeg10);
		setRotationAngle(leftLeg10, 1.4835F, 0.0F, 0.0F);
		leftLeg10.texOffs(1, 26).addBox(-2.1F, -1.0F, -2.5F, 4.0F, 9.0F, 4.0F, 0.5F, false);

		leftLeg11 = new ModelRenderer(this);
		leftLeg11.setPos(0.0F, 7.0F, 0.0F);
		leftLeg10.addChild(leftLeg11);
		setRotationAngle(leftLeg11, -0.6981F, 0.0F, 0.0F);
		leftLeg11.texOffs(0, 39).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 6.0F, 3.0F, 0.5F, false);
		leftLeg11.texOffs(12, 39).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 6.0F, 3.0F, 0.7F, false);

		fang2 = new ModelRenderer(this);
		fang2.setPos(0.0F, 4.0F, -4.0F);
		leftLeg11.addChild(fang2);
		setRotationAngle(fang2, -0.3491F, 0.0F, 0.0F);
		fang2.texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		fang2.texOffs(1, 6).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		fang2.texOffs(1, 12).addBox(-0.5F, -2.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		fang2.texOffs(0, 16).addBox(-0.5F, -2.0F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.0F, 10.0F, -0.5F);
		

		rightLeg4 = new ModelRenderer(this);
		rightLeg4.setPos(0.0F, 0.0F, 0.0F);
		rightLeg.addChild(rightLeg4);
		setRotationAngle(rightLeg4, -0.7418F, 0.0F, 0.0F);
		rightLeg4.texOffs(0, 12).addBox(-5.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.5F, true);

		rightLeg8 = new ModelRenderer(this);
		rightLeg8.setPos(-2.0F, 3.0F, 0.0F);
		rightLeg4.addChild(rightLeg8);
		setRotationAngle(rightLeg8, 1.4835F, 0.0F, 0.0F);
		rightLeg8.texOffs(1, 26).addBox(-1.9F, -1.0F, -2.5F, 4.0F, 9.0F, 4.0F, 0.5F, true);

		rightLeg9 = new ModelRenderer(this);
		rightLeg9.setPos(0.0F, 7.0F, 0.0F);
		rightLeg8.addChild(rightLeg9);
		setRotationAngle(rightLeg9, -0.6981F, 0.0F, 0.0F);
		rightLeg9.texOffs(0, 39).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 6.0F, 3.0F, 0.5F, true);
		rightLeg9.texOffs(12, 39).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 6.0F, 3.0F, 0.7F, true);

		fang = new ModelRenderer(this);
		fang.setPos(0.0F, 4.0F, -4.0F);
		rightLeg9.addChild(fang);
		setRotationAngle(fang, -0.3491F, 0.0F, 0.0F);
		fang.texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		fang.texOffs(1, 6).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		fang.texOffs(1, 12).addBox(-0.5F, -2.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		fang.texOffs(0, 16).addBox(-0.5F, -2.0F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}