// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelNorscaHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer horn;
	private final ModelRenderer horn2;
	private final ModelRenderer horn3;
	private final ModelRenderer horn_r1;
	private final ModelRenderer horn4;
	private final ModelRenderer horn5;
	private final ModelRenderer horn_r2;
	private final ModelRenderer hornRight;
	private final ModelRenderer horn7;
	private final ModelRenderer horn8;
	private final ModelRenderer horn_r3;
	private final ModelRenderer horn9;
	private final ModelRenderer horn10;
	private final ModelRenderer horn_r4;

	public WFMModelNorscaHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.75F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		head.texOffs(0, 17).addBox(-2.5F, -11.0F, -2.5076F, 5.0F, 2.0F, 5.0F, -0.2F, false);
		head.texOffs(0, 24).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.1F, false);

		horn = new ModelRenderer(this);
		horn.setPos(5.0F, -8.0F, 0.0F);
		head.addChild(horn);
		setRotationAngle(horn, 0.0F, 0.0F, -0.2618F);
		horn.texOffs(50, 58).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		horn2 = new ModelRenderer(this);
		horn2.setPos(1.0F, 0.0F, -1.0F);
		horn.addChild(horn2);
		setRotationAngle(horn2, 0.0F, 0.0F, -0.9163F);
		horn2.texOffs(52, 53).addBox(0.0F, -2.0F, 0.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
		horn2.texOffs(42, 57).addBox(2.0F, -2.5F, -0.5F, 1.0F, 4.0F, 3.0F, 0.0F, false);

		horn3 = new ModelRenderer(this);
		horn3.setPos(3.0F, 0.0F, 0.0F);
		horn2.addChild(horn3);
		setRotationAngle(horn3, 0.0F, 0.0F, -0.829F);
		horn3.texOffs(52, 49).addBox(0.0F, -1.0F, -0.1F, 4.0F, 2.0F, 2.0F, 0.0F, false);

		horn_r1 = new ModelRenderer(this);
		horn_r1.setPos(2.0F, 1.0F, 0.0F);
		horn3.addChild(horn_r1);
		setRotationAngle(horn_r1, 0.0F, 0.0F, 0.1309F);
		horn_r1.texOffs(56, 34).addBox(-2.0F, -10.0F, 0.9F, 4.0F, 10.0F, 0.0F, 0.0F, false);

		horn4 = new ModelRenderer(this);
		horn4.setPos(3.0F, 0.0F, 0.0F);
		horn3.addChild(horn4);
		setRotationAngle(horn4, 0.0F, 0.0F, 0.829F);
		horn4.texOffs(52, 46).addBox(0.0F, -1.0F, 0.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);

		horn5 = new ModelRenderer(this);
		horn5.setPos(3.0F, 0.0F, 0.0F);
		horn4.addChild(horn5);
		

		horn_r2 = new ModelRenderer(this);
		horn_r2.setPos(0.0F, -0.5F, 0.0F);
		horn5.addChild(horn_r2);
		setRotationAngle(horn_r2, 0.0F, 0.0F, 0.5672F);
		horn_r2.texOffs(54, 44).addBox(0.0F, -0.5F, 0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		hornRight = new ModelRenderer(this);
		hornRight.setPos(-5.0F, -8.0F, 0.0F);
		head.addChild(hornRight);
		setRotationAngle(hornRight, 3.1416F, 0.0F, -2.8798F);
		hornRight.texOffs(50, 58).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		horn7 = new ModelRenderer(this);
		horn7.setPos(1.0F, 0.0F, -1.0F);
		hornRight.addChild(horn7);
		setRotationAngle(horn7, 0.0F, 0.0F, -0.9163F);
		horn7.texOffs(52, 53).addBox(0.0F, -2.0F, 0.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
		horn7.texOffs(42, 57).addBox(2.0F, -2.5F, -0.5F, 1.0F, 4.0F, 3.0F, 0.0F, false);

		horn8 = new ModelRenderer(this);
		horn8.setPos(3.0F, 0.0F, 0.0F);
		horn7.addChild(horn8);
		setRotationAngle(horn8, 0.0F, 0.0F, -0.829F);
		horn8.texOffs(52, 49).addBox(0.0F, -1.0F, -0.1F, 4.0F, 2.0F, 2.0F, 0.0F, false);

		horn_r3 = new ModelRenderer(this);
		horn_r3.setPos(2.0F, 1.0F, 0.0F);
		horn8.addChild(horn_r3);
		setRotationAngle(horn_r3, 0.0F, 0.0F, 0.1309F);
		horn_r3.texOffs(56, 34).addBox(-2.0F, -10.0F, 0.9F, 4.0F, 10.0F, 0.0F, 0.0F, false);

		horn9 = new ModelRenderer(this);
		horn9.setPos(3.0F, 0.0F, 0.0F);
		horn8.addChild(horn9);
		setRotationAngle(horn9, 0.0F, 0.0F, 0.829F);
		horn9.texOffs(52, 46).addBox(0.0F, -1.0F, 0.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);

		horn10 = new ModelRenderer(this);
		horn10.setPos(3.0F, 0.0F, 0.0F);
		horn9.addChild(horn10);
		

		horn_r4 = new ModelRenderer(this);
		horn_r4.setPos(0.0F, -0.5F, 0.0F);
		horn10.addChild(horn_r4);
		setRotationAngle(horn_r4, 0.0F, 0.0F, 0.5672F);
		horn_r4.texOffs(54, 44).addBox(0.0F, -0.5F, 0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
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