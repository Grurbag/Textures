// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelGoblinHelmet extends EntityModel<Entity> {
	private final ModelRenderer helmet;
	private final ModelRenderer helmet2;
	private final ModelRenderer helmet3;
	private final ModelRenderer spike;
	private final ModelRenderer spike2;
	private final ModelRenderer shapka;
	private final ModelRenderer shapkaRight3;
	private final ModelRenderer shapkaRight2;
	private final ModelRenderer shapkaRight;
	private final ModelRenderer shapkaMIddle2;
	private final ModelRenderer shapkaLeft3;
	private final ModelRenderer shapkaLeft2;
	private final ModelRenderer shapkaLeft;
	private final ModelRenderer shapkaMIddle;

	public WFMModelGoblinHelmet() {
		texWidth = 64;
		texHeight = 64;

		helmet = new ModelRenderer(this);
		helmet.setPos(0.0F, 4.0F, -2.0F);
		helmet.texOffs(0, 0).addBox(-4.0F, -5.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		helmet2 = new ModelRenderer(this);
		helmet2.setPos(0.0F, -10.0F, -1.0F);
		helmet.addChild(helmet2);
		helmet2.texOffs(32, 0).addBox(-4.0F, 3.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);

		helmet3 = new ModelRenderer(this);
		helmet3.setPos(0.0F, -1.0F, 0.0F);
		helmet2.addChild(helmet3);
		helmet3.texOffs(35, 10).addBox(-3.0F, 3.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);

		spike = new ModelRenderer(this);
		spike.setPos(0.0F, -8.0F, -1.0F);
		helmet.addChild(spike);
		spike.texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		spike2 = new ModelRenderer(this);
		spike2.setPos(0.0F, -3.0F, 0.0F);
		spike.addChild(spike2);
		setRotationAngle(spike2, 0.0F, -0.7854F, 0.0F);
		spike2.texOffs(28, -5).addBox(0.0F, -4.0F, -2.5F, 0.0F, 6.0F, 5.0F, 0.0F, false);

		shapka = new ModelRenderer(this);
		shapka.setPos(0.0F, -1.0F, -1.0F);
		helmet.addChild(shapka);
		

		shapkaRight3 = new ModelRenderer(this);
		shapkaRight3.setPos(-3.0F, -2.0F, 5.0F);
		shapka.addChild(shapkaRight3);
		shapkaRight3.texOffs(-2, 31).addBox(-3.0F, -2.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);

		shapkaRight2 = new ModelRenderer(this);
		shapkaRight2.setPos(-4.0F, -2.0F, -2.0F);
		shapka.addChild(shapkaRight2);
		shapkaRight2.texOffs(-1, 39).addBox(-3.0F, -2.0F, -1.5F, 3.0F, 3.0F, 7.0F, 0.0F, true);

		shapkaRight = new ModelRenderer(this);
		shapkaRight.setPos(-3.0F, -2.0F, -4.0F);
		shapka.addChild(shapkaRight);
		shapkaRight.texOffs(-2, 31).addBox(-3.0F, -2.0F, -2.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);

		shapkaMIddle2 = new ModelRenderer(this);
		shapkaMIddle2.setPos(0.0F, -2.0F, 5.0F);
		shapka.addChild(shapkaMIddle2);
		shapkaMIddle2.texOffs(-1, 25).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);

		shapkaLeft3 = new ModelRenderer(this);
		shapkaLeft3.setPos(5.0F, -2.0F, 8.0F);
		shapka.addChild(shapkaLeft3);
		shapkaLeft3.texOffs(-1, 31).addBox(-2.0F, -2.0F, -4.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		shapkaLeft2 = new ModelRenderer(this);
		shapkaLeft2.setPos(6.0F, -2.0F, -2.0F);
		shapka.addChild(shapkaLeft2);
		shapkaLeft2.texOffs(0, 39).addBox(-2.0F, -2.0F, -1.5F, 3.0F, 3.0F, 7.0F, 0.0F, false);

		shapkaLeft = new ModelRenderer(this);
		shapkaLeft.setPos(5.0F, -2.0F, -4.0F);
		shapka.addChild(shapkaLeft);
		shapkaLeft.texOffs(-1, 31).addBox(-2.0F, -2.0F, -2.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		shapkaMIddle = new ModelRenderer(this);
		shapkaMIddle.setPos(0.0F, -2.0F, -5.0F);
		shapka.addChild(shapkaMIddle);
		shapkaMIddle.texOffs(-1, 25).addBox(-3.0F, -2.0F, -2.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);
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