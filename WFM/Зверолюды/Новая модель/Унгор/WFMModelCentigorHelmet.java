// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelCentigorHelmet extends EntityModel<Entity> {
	private final ModelRenderer headArmour;
	private final ModelRenderer mouthArmour;
	private final ModelRenderer mouth_r1;

	public WFMModelCentigorHelmet() {
		texWidth = 128;
		texHeight = 64;

		headArmour = new ModelRenderer(this);
		headArmour.setPos(0.0F, -10.0F, -1.0F);
		headArmour.texOffs(0, 0).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		mouthArmour = new ModelRenderer(this);
		mouthArmour.setPos(0.0F, 2.4959F, -4.1234F);
		headArmour.addChild(mouthArmour);
		setRotationAngle(mouthArmour, 0.2182F, 0.0F, 0.0F);
		

		mouth_r1 = new ModelRenderer(this);
		mouth_r1.setPos(-1.0F, 1.0F, -1.0F);
		mouthArmour.addChild(mouth_r1);
		setRotationAngle(mouth_r1, 0.3927F, 0.0F, 0.0F);
		mouth_r1.texOffs(0, 25).addBox(-2.0F, -10.2766F, -0.7057F, 6.0F, 7.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		headArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}