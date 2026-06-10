// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelOgreBoots extends EntityModel<Entity> {
	private final ModelRenderer leftBoot;
	private final ModelRenderer feetLeft2;
	private final ModelRenderer rightBoot;
	private final ModelRenderer feetRight2;

	public WFMModelOgreBoots() {
		texWidth = 128;
		texHeight = 128;

		leftBoot = new ModelRenderer(this);
		leftBoot.setPos(2.0F, 2.0F, 3.0F);
		leftBoot.texOffs(0, 0).addBox(0.0F, -4.0F, -5.0F, 11.0F, 26.0F, 10.0F, 0.6F, false);
		leftBoot.texOffs(42, 0).addBox(0.0F, -4.0F, -5.0F, 11.0F, 26.0F, 10.0F, 0.7F, false);

		feetLeft2 = new ModelRenderer(this);
		feetLeft2.setPos(0.0F, 0.0F, -4.0F);
		leftBoot.addChild(feetLeft2);
		feetLeft2.texOffs(0, 37).addBox(1.0F, 16.0F, -5.0F, 9.0F, 6.0F, 5.0F, 0.5F, false);
		feetLeft2.texOffs(28, 37).addBox(1.0F, 16.0F, -5.0F, 9.0F, 6.0F, 5.0F, 0.7F, false);

		rightBoot = new ModelRenderer(this);
		rightBoot.setPos(-1.0F, 2.0F, 3.0F);
		rightBoot.texOffs(0, 0).addBox(-11.0F, -4.0F, -5.0F, 11.0F, 26.0F, 10.0F, 0.6F, true);
		rightBoot.texOffs(42, 0).addBox(-11.0F, -4.0F, -5.0F, 11.0F, 26.0F, 10.0F, 0.7F, true);

		feetRight2 = new ModelRenderer(this);
		feetRight2.setPos(-11.0F, 0.0F, -4.0F);
		rightBoot.addChild(feetRight2);
		feetRight2.texOffs(0, 37).addBox(1.0F, 16.0F, -5.0F, 9.0F, 6.0F, 5.0F, 0.5F, true);
		feetRight2.texOffs(28, 37).addBox(1.0F, 16.0F, -5.0F, 9.0F, 6.0F, 5.0F, 0.7F, true);
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