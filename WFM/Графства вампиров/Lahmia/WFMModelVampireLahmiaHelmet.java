// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelVampireLahmiaHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer wings;
	private final ModelRenderer wings2;
	private final ModelRenderer wings3;
	private final ModelRenderer flowers;
	private final ModelRenderer Pero21_r1;
	private final ModelRenderer Pero21_r2;
	private final ModelRenderer Pero22_r1;
	private final ModelRenderer Pero22_r2;
	private final ModelRenderer Pero21_r3;
	private final ModelRenderer Pero22_r3;

	public WFMModelVampireLahmiaHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.75F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

		wings = new ModelRenderer(this);
		wings.setPos(-2.1736F, -7.0152F, 1.0F);
		head.addChild(wings);
		setRotationAngle(wings, 0.0F, 0.0F, 0.1745F);
		wings.texOffs(0, 57).addBox(-2.0F, -7.0F, 0.0F, 4.0F, 7.0F, 0.0F, 0.0F, false);

		wings2 = new ModelRenderer(this);
		wings2.setPos(1.3912F, -0.7934F, 1.0F);
		wings.addChild(wings2);
		setRotationAngle(wings2, 0.0F, 0.0F, -0.829F);
		wings2.texOffs(0, 57).addBox(-4.0F, -7.0F, 0.0F, 4.0F, 7.0F, 0.0F, 0.0F, false);

		wings3 = new ModelRenderer(this);
		wings3.setPos(-0.6088F, -0.7934F, 0.0F);
		wings2.addChild(wings3);
		setRotationAngle(wings3, 0.0F, 0.0F, -0.829F);
		wings3.texOffs(0, 57).addBox(-4.0F, -7.0F, -1.0F, 4.0F, 7.0F, 0.0F, 0.0F, false);

		flowers = new ModelRenderer(this);
		flowers.setPos(0.0F, 1.0F, -1.0F);
		head.addChild(flowers);
		

		Pero21_r1 = new ModelRenderer(this);
		Pero21_r1.setPos(-0.9782F, -12.0928F, -0.3275F);
		flowers.addChild(Pero21_r1);
		setRotationAngle(Pero21_r1, -2.7915F, 0.243F, 1.0617F);
		Pero21_r1.texOffs(44, 52).addBox(0.0448F, -6.8982F, -3.2467F, 0.0F, 7.0F, 5.0F, 0.0F, false);

		Pero21_r2 = new ModelRenderer(this);
		Pero21_r2.setPos(0.0218F, -10.0928F, 1.6725F);
		flowers.addChild(Pero21_r2);
		setRotationAngle(Pero21_r2, 2.7877F, 0.3757F, 1.573F);
		Pero21_r2.texOffs(44, 52).addBox(2.0448F, -7.8982F, -1.2467F, 0.0F, 7.0F, 5.0F, 0.0F, false);

		Pero22_r1 = new ModelRenderer(this);
		Pero22_r1.setPos(-0.9782F, -12.0928F, -0.3275F);
		flowers.addChild(Pero22_r1);
		setRotationAngle(Pero22_r1, -2.9155F, -1.0494F, 1.4361F);
		Pero22_r1.texOffs(54, 50).addBox(1.0804F, -7.9231F, -1.2467F, 0.0F, 9.0F, 5.0F, 0.0F, false);

		Pero22_r2 = new ModelRenderer(this);
		Pero22_r2.setPos(-0.9782F, -12.0928F, -0.3275F);
		flowers.addChild(Pero22_r2);
		setRotationAngle(Pero22_r2, 0.8352F, 0.7477F, 1.7454F);
		Pero22_r2.texOffs(54, 50).addBox(1.0804F, -6.9231F, -1.2467F, 0.0F, 9.0F, 5.0F, 0.0F, false);

		Pero21_r3 = new ModelRenderer(this);
		Pero21_r3.setPos(0.0218F, -10.0928F, 1.6725F);
		flowers.addChild(Pero21_r3);
		setRotationAngle(Pero21_r3, 1.0909F, 0.5839F, 1.7253F);
		Pero21_r3.texOffs(44, 52).addBox(-0.9552F, -1.8982F, -2.2467F, 0.0F, 7.0F, 5.0F, 0.0F, false);

		Pero22_r3 = new ModelRenderer(this);
		Pero22_r3.setPos(0.0218F, -10.0928F, 1.6725F);
		flowers.addChild(Pero22_r3);
		setRotationAngle(Pero22_r3, -0.3988F, 0.2206F, 1.6955F);
		Pero22_r3.texOffs(54, 50).addBox(0.0804F, -7.9231F, -2.2467F, 0.0F, 9.0F, 5.0F, 0.0F, false);
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