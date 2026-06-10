// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelNightGoblinHelmet extends EntityModel<Entity> {
	private final ModelRenderer helmet;
	private final ModelRenderer helmet2;
	private final ModelRenderer helmet3;
	private final ModelRenderer helmet4;
	private final ModelRenderer helmet5;
	private final ModelRenderer helmet6;

	public WFMModelNightGoblinHelmet() {
		texWidth = 64;
		texHeight = 64;

		helmet = new ModelRenderer(this);
		helmet.setPos(0.0F, 4.0F, -2.0F);
		helmet.texOffs(0, 0).addBox(-4.0F, -5.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		helmet2 = new ModelRenderer(this);
		helmet2.setPos(0.0F, -2.8478F, -2.2654F);
		helmet.addChild(helmet2);
		setRotationAngle(helmet2, 0.3927F, 0.0F, 0.0F);
		helmet2.texOffs(1, 16).addBox(-5.0F, -4.0F, -3.5F, 10.0F, 8.0F, 8.0F, 0.5F, false);

		helmet3 = new ModelRenderer(this);
		helmet3.setPos(0.0F, -4.5F, -1.0F);
		helmet.addChild(helmet3);
		setRotationAngle(helmet3, -0.1745F, 0.0F, 0.0F);
		helmet3.texOffs(0, 32).addBox(-3.0F, -3.5F, -3.0F, 6.0F, 3.0F, 6.0F, 0.5F, false);

		helmet4 = new ModelRenderer(this);
		helmet4.setPos(0.0F, -2.0F, 0.0F);
		helmet3.addChild(helmet4);
		setRotationAngle(helmet4, -0.2618F, 0.0F, 0.0F);
		helmet4.texOffs(48, 0).addBox(-2.0F, -4.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.5F, false);

		helmet5 = new ModelRenderer(this);
		helmet5.setPos(0.0F, -4.0F, 0.0F);
		helmet4.addChild(helmet5);
		setRotationAngle(helmet5, -0.2618F, 0.0F, 0.0F);
		helmet5.texOffs(51, 12).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.5F, false);

		helmet6 = new ModelRenderer(this);
		helmet6.setPos(0.0F, -3.0F, 0.0F);
		helmet5.addChild(helmet6);
		setRotationAngle(helmet6, -0.4363F, 0.0F, 0.0F);
		helmet6.texOffs(51, 19).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		helmet.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}