// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelCathayGunnerHelmet extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer povyazka;
	private final ModelRenderer pipka;
	private final ModelRenderer lenta;
	private final ModelRenderer lenta2;
	private final ModelRenderer pipkaLob;

	public WFMModelCathayGunnerHelmet() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.75F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

		povyazka = new ModelRenderer(this);
		povyazka.setPos(0.0F, -5.0F, 0.0F);
		Head.addChild(povyazka);
		setRotationAngle(povyazka, -0.2182F, 0.0F, 0.0F);
		povyazka.texOffs(0, 51).addBox(-5.0F, -2.0F, -5.0F, 10.0F, 3.0F, 10.0F, 0.0F, false);

		pipka = new ModelRenderer(this);
		pipka.setPos(0.0F, 0.0F, 5.5F);
		povyazka.addChild(pipka);
		setRotationAngle(pipka, 0.0F, 0.0F, 0.7854F);
		pipka.texOffs(58, 61).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		lenta = new ModelRenderer(this);
		lenta.setPos(0.6903F, 0.6903F, 0.2164F);
		pipka.addChild(lenta);
		setRotationAngle(lenta, 0.0097F, -0.218F, 0.7407F);
		lenta.texOffs(39, 61).addBox(-1.0F, -2.0F, 0.0F, 7.0F, 3.0F, 0.0F, 0.0F, false);

		lenta2 = new ModelRenderer(this);
		lenta2.setPos(-0.0436F, 0.999F, 0.0F);
		lenta.addChild(lenta2);
		setRotationAngle(lenta2, 0.102F, -0.1932F, 0.2955F);
		lenta2.texOffs(39, 58).addBox(-1.0F, -2.0F, 0.0F, 7.0F, 3.0F, 0.0F, 0.0F, false);

		pipkaLob = new ModelRenderer(this);
		pipkaLob.setPos(0.0F, 0.0F, -4.5F);
		povyazka.addChild(pipkaLob);
		setRotationAngle(pipkaLob, 0.2182F, 0.0F, 0.0F);
		pipkaLob.texOffs(27, 32).addBox(-2.0F, -2.0F, -1.1F, 4.0F, 4.0F, 1.0F, -0.3F, false);
		pipkaLob.texOffs(28, 37).addBox(-1.5F, -2.5F, -1.09F, 3.0F, 2.0F, 1.0F, -0.3F, false);
		pipkaLob.texOffs(28, 37).addBox(-1.5F, 0.5F, -1.09F, 3.0F, 2.0F, 1.0F, -0.3F, false);
		pipkaLob.texOffs(37, 32).addBox(0.5F, -1.5F, -1.09F, 2.0F, 3.0F, 1.0F, -0.3F, false);
		pipkaLob.texOffs(37, 32).addBox(-2.5F, -1.5F, -1.09F, 2.0F, 3.0F, 1.0F, -0.3F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}