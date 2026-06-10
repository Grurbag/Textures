// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelCathayPeasantHat extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer hat;
	private final ModelRenderer hat_r1;
	private final ModelRenderer hat_r2;
	private final ModelRenderer hat_r3;
	private final ModelRenderer hat_r4;
	private final ModelRenderer hat_r5;
	private final ModelRenderer lenta;
	private final ModelRenderer lenta_r1;
	private final ModelRenderer lenta2;
	private final ModelRenderer lenta_r2;
	private final ModelRenderer pipka;

	public WFMModelCathayPeasantHat() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

		hat = new ModelRenderer(this);
		hat.setPos(0.0F, -10.0761F, 0.3827F);
		Head.addChild(hat);
		setRotationAngle(hat, 0.3927F, 0.0F, 0.0F);
		hat.texOffs(-13, 51).addBox(-5.0F, 0.0F, -13.0F, 10.0F, 0.0F, 13.0F, 0.0F, false);

		hat_r1 = new ModelRenderer(this);
		hat_r1.setPos(5.0F, 0.0F, 0.0F);
		hat.addChild(hat_r1);
		setRotationAngle(hat_r1, -2.4409F, -0.3897F, -2.7183F);
		hat_r1.texOffs(31, 51).addBox(-10.0F, 0.0F, -13.0F, 10.0F, 0.0F, 13.0F, 0.0F, false);

		hat_r2 = new ModelRenderer(this);
		hat_r2.setPos(5.0F, 0.0F, 0.0F);
		hat.addChild(hat_r2);
		setRotationAngle(hat_r2, 0.0F, 0.0F, -2.5744F);
		hat_r2.texOffs(31, 51).addBox(-10.0F, 0.0F, -13.0F, 10.0F, 0.0F, 13.0F, 0.0F, false);

		hat_r3 = new ModelRenderer(this);
		hat_r3.setPos(-5.0F, 0.0F, 0.0F);
		hat.addChild(hat_r3);
		setRotationAngle(hat_r3, 2.4409F, -0.3897F, -0.4233F);
		hat_r3.texOffs(31, 51).addBox(-10.0F, 0.0F, -13.0F, 10.0F, 0.0F, 13.0F, 0.0F, false);

		hat_r4 = new ModelRenderer(this);
		hat_r4.setPos(0.0F, 0.0F, 0.0F);
		hat.addChild(hat_r4);
		setRotationAngle(hat_r4, 2.3562F, 0.0F, 0.0F);
		hat_r4.texOffs(-13, 51).addBox(-5.0F, 0.0F, -13.0F, 10.0F, 0.0F, 13.0F, 0.0F, false);

		hat_r5 = new ModelRenderer(this);
		hat_r5.setPos(-5.0F, 0.0F, 0.0F);
		hat.addChild(hat_r5);
		setRotationAngle(hat_r5, 0.0F, 0.0F, -0.5672F);
		hat_r5.texOffs(31, 51).addBox(-10.0F, 0.0F, -13.0F, 10.0F, 0.0F, 13.0F, 0.0F, false);

		lenta = new ModelRenderer(this);
		lenta.setPos(-5.0F, -0.3F, 0.0F);
		hat.addChild(lenta);
		

		lenta_r1 = new ModelRenderer(this);
		lenta_r1.setPos(0.0F, 0.3F, 0.0F);
		lenta.addChild(lenta_r1);
		setRotationAngle(lenta_r1, 0.0F, 0.829F, -0.5672F);
		lenta_r1.texOffs(43, 39).addBox(0.0F, -0.3F, -11.0F, 4.0F, 0.0F, 11.0F, 0.0F, false);

		lenta2 = new ModelRenderer(this);
		lenta2.setPos(0.0F, 0.0F, 0.0F);
		lenta.addChild(lenta2);
		

		lenta_r2 = new ModelRenderer(this);
		lenta_r2.setPos(-5.5963F, 3.5652F, -6.0803F);
		lenta2.addChild(lenta_r2);
		setRotationAngle(lenta_r2, 0.9163F, 0.829F, -0.5672F);
		lenta_r2.texOffs(47, 26).addBox(0.0F, 0.0F, -9.0F, 4.0F, 0.0F, 9.0F, 0.0F, false);

		pipka = new ModelRenderer(this);
		pipka.setPos(0.0F, -10.0F, 0.0F);
		Head.addChild(pipka);
		pipka.texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		pipka.texOffs(10, 1).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
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