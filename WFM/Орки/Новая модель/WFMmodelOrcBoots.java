// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMmodelOrcBoots extends EntityModel<Entity> {
	private final ModelRenderer leftBoot;
	private final ModelRenderer feet_r1;
	private final ModelRenderer rightBoot;
	private final ModelRenderer feet_r2;

	public WFMmodelOrcBoots() {
		texWidth = 64;
		texHeight = 64;

		leftBoot = new ModelRenderer(this);
		leftBoot.setPos(1.0F, 11.9981F, -0.0872F);
		setRotationAngle(leftBoot, 0.0436F, 0.0F, 0.0F);
		leftBoot.texOffs(0, 27).addBox(0.0F, 4.0019F, -3.4128F, 5.0F, 8.0F, 5.0F, 0.65F, true);

		feet_r1 = new ModelRenderer(this);
		feet_r1.setPos(5.0F, 11.5642F, -4.981F);
		leftBoot.addChild(feet_r1);
		setRotationAngle(feet_r1, -0.0436F, 0.0F, 0.0F);
		feet_r1.texOffs(0, 41).addBox(-5.0F, -1.0F, -1.0F, 5.0F, 2.0F, 6.0F, 0.55F, true);

		rightBoot = new ModelRenderer(this);
		rightBoot.setPos(-1.0F, 11.9981F, -0.0872F);
		setRotationAngle(rightBoot, 0.0436F, 0.0F, 0.0F);
		rightBoot.texOffs(0, 27).addBox(-5.0F, 4.0019F, -3.4128F, 5.0F, 8.0F, 5.0F, 0.65F, false);

		feet_r2 = new ModelRenderer(this);
		feet_r2.setPos(-1.0F, 11.5642F, -4.981F);
		rightBoot.addChild(feet_r2);
		setRotationAngle(feet_r2, -0.0436F, 0.0F, 0.0F);
		feet_r2.texOffs(0, 41).addBox(-4.0F, -1.0F, -1.0F, 5.0F, 2.0F, 6.0F, 0.55F, false);
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