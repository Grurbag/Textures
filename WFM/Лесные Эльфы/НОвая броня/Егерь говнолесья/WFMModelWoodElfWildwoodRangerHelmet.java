// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelWoodElfWildwoodRangerHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer maska_namordnik;
	private final ModelRenderer maska_namordnik2;

	public WFMModelWoodElfWildwoodRangerHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		head.texOffs(38, 16).addBox(-4.0F, -8.0F, 5.0F, 8.0F, 8.0F, 2.0F, 0.0F, false);
		head.texOffs(39, 26).addBox(-3.0F, 0.0F, 5.0F, 6.0F, 4.0F, 2.0F, 0.0F, false);
		head.texOffs(41, 33).addBox(-1.0F, 4.0F, 5.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		head.texOffs(0, 24).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.1F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(0.0F, -8.3279F, 0.9924F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, 0.0F);
		head_r1.texOffs(0, 17).addBox(-2.5F, -2.6721F, -3.5F, 5.0F, 2.0F, 5.0F, -0.2F, false);

		maska_namordnik = new ModelRenderer(this);
		maska_namordnik.setPos(0.0F, 0.0F, -6.3F);
		head.addChild(maska_namordnik);
		setRotationAngle(maska_namordnik, 0.0F, -0.3054F, 0.0F);
		maska_namordnik.texOffs(0, 48).addBox(0.0F, -12.0F, 0.0F, 7.0F, 16.0F, 0.0F, 0.0F, false);

		maska_namordnik2 = new ModelRenderer(this);
		maska_namordnik2.setPos(0.0F, 0.0F, -6.3F);
		head.addChild(maska_namordnik2);
		setRotationAngle(maska_namordnik2, 0.0F, 0.3491F, 0.0F);
		maska_namordnik2.texOffs(14, 48).addBox(-7.0F, -12.0F, 0.0F, 7.0F, 16.0F, 0.0F, 0.0F, false);
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