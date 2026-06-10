// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelWoodElfHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer maska_namordnik;
	private final ModelRenderer maska_namordnik2;

	public WFMModelWoodElfHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

		maska_namordnik = new ModelRenderer(this);
		maska_namordnik.setPos(0.0F, 0.0F, -6.3F);
		head.addChild(maska_namordnik);
		setRotationAngle(maska_namordnik, 0.0F, -0.3054F, 0.0F);
		maska_namordnik.texOffs(0, 41).addBox(0.0F, -19.0F, 0.0F, 7.0F, 23.0F, 0.0F, 0.0F, false);

		maska_namordnik2 = new ModelRenderer(this);
		maska_namordnik2.setPos(0.0F, 0.0F, -6.3F);
		head.addChild(maska_namordnik2);
		setRotationAngle(maska_namordnik2, 0.0F, 0.3491F, 0.0F);
		maska_namordnik2.texOffs(14, 41).addBox(-7.0F, -19.0F, 0.0F, 7.0F, 23.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}