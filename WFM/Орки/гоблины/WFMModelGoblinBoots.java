// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelGoblinBoots extends EntityModel<Entity> {
	private final ModelRenderer leftBoot;
	private final ModelRenderer leftBoot2;
	private final ModelRenderer leftBoot3;
	private final ModelRenderer rightBoot;
	private final ModelRenderer rightBoot2;
	private final ModelRenderer rightBoot3;

	public WFMModelGoblinBoots() {
		texWidth = 64;
		texHeight = 64;

		leftBoot = new ModelRenderer(this);
		leftBoot.setPos(1.9F, 13.0F, 2.0F);
		setRotationAngle(leftBoot, -0.3054F, 0.0F, 0.0F);
		

		leftBoot2 = new ModelRenderer(this);
		leftBoot2.setPos(0.0F, 3.1388F, -0.9021F);
		leftBoot.addChild(leftBoot2);
		setRotationAngle(leftBoot2, 0.3054F, 0.0F, 0.0F);
		leftBoot2.texOffs(0, 42).addBox(-1.4F, 7.0F, -4.0F, 4.0F, 2.0F, 5.0F, 0.5F, true);

		leftBoot3 = new ModelRenderer(this);
		leftBoot3.setPos(0.0F, 0.0F, 0.0F);
		leftBoot2.addChild(leftBoot3);
		leftBoot3.texOffs(0, 57).addBox(-1.4F, 7.0F, -4.0F, 4.0F, 2.0F, 5.0F, 0.3F, true);

		rightBoot = new ModelRenderer(this);
		rightBoot.setPos(-2.1F, 13.0F, 2.0F);
		setRotationAngle(rightBoot, -0.3054F, 0.0F, 0.0F);
		

		rightBoot2 = new ModelRenderer(this);
		rightBoot2.setPos(-1.0F, 3.1388F, -0.9021F);
		rightBoot.addChild(rightBoot2);
		setRotationAngle(rightBoot2, 0.3054F, 0.0F, 0.0F);
		rightBoot2.texOffs(0, 42).addBox(-1.4F, 7.0F, -4.0F, 4.0F, 2.0F, 5.0F, 0.5F, false);

		rightBoot3 = new ModelRenderer(this);
		rightBoot3.setPos(0.0F, 0.0F, 0.0F);
		rightBoot2.addChild(rightBoot3);
		rightBoot3.texOffs(0, 57).addBox(-1.4F, 7.0F, -4.0F, 4.0F, 2.0F, 5.0F, 0.3F, false);
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