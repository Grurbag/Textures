// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelMinotaurBody extends EntityModel<Entity> {
	private final ModelRenderer bodyArmour;
	private final ModelRenderer bodyArmour2;
	private final ModelRenderer bodyArmour3;
	private final ModelRenderer puzo;
	private final ModelRenderer spike;
	private final ModelRenderer horn_puzo_left;
	private final ModelRenderer horn_puzo_left2;
	private final ModelRenderer horn_puzo_left3;
	private final ModelRenderer horn_puzo_left4;
	private final ModelRenderer horn_puzo_right;
	private final ModelRenderer horn_puzo_right2;
	private final ModelRenderer horn_puzo_right3;
	private final ModelRenderer horn_puzo_right4;
	private final ModelRenderer povyazka;
	private final ModelRenderer leftArmArmour;
	private final ModelRenderer leftArmArmour2;
	private final ModelRenderer rightArmArmour;
	private final ModelRenderer rightArmArmour2;

	public WFMModelMinotaurBody() {
		texWidth = 128;
		texHeight = 128;

		bodyArmour = new ModelRenderer(this);
		bodyArmour.setPos(0.0F, -6.0F, 0.0F);
		bodyArmour.texOffs(-1, -1).addBox(-10.0F, -13.0F, -6.0F, 20.0F, 12.0F, 13.0F, 0.5F, false);

		bodyArmour2 = new ModelRenderer(this);
		bodyArmour2.setPos(0.0F, 10.0F, 0.0F);
		bodyArmour.addChild(bodyArmour2);
		bodyArmour2.texOffs(0, 26).addBox(-7.5F, -11.0F, -5.0F, 15.0F, 10.0F, 11.0F, 0.5F, false);

		bodyArmour3 = new ModelRenderer(this);
		bodyArmour3.setPos(0.0F, -12.5F, -0.5F);
		bodyArmour.addChild(bodyArmour3);
		setRotationAngle(bodyArmour3, -0.4363F, 0.0F, 0.0F);
		bodyArmour3.texOffs(-1, 108).addBox(-6.0F, -2.5F, -5.5F, 12.0F, 10.0F, 10.0F, 0.5F, false);

		puzo = new ModelRenderer(this);
		puzo.setPos(0.0F, 9.0F, -6.0F);
		bodyArmour.addChild(puzo);
		setRotationAngle(puzo, 0.0F, 0.0F, 0.7854F);
		puzo.texOffs(43, 115).addBox(-7.0F, -7.0F, -2.0F, 10.0F, 10.0F, 3.0F, 0.0F, false);

		spike = new ModelRenderer(this);
		spike.setPos(-1.0F, -1.0F, -3.0F);
		puzo.addChild(spike);
		setRotationAngle(spike, 0.0F, 0.0F, 0.7854F);
		spike.texOffs(-10, 92).addBox(-8.0F, 0.0F, -9.0F, 13.0F, 0.0F, 10.0F, 0.0F, false);

		horn_puzo_left = new ModelRenderer(this);
		horn_puzo_left.setPos(1.0F, -9.1255F, 2.0627F);
		puzo.addChild(horn_puzo_left);
		setRotationAngle(horn_puzo_left, 1.1012F, -0.3206F, -2.1793F);
		horn_puzo_left.texOffs(55, 57).addBox(-5.0F, -1.5F, -2.8226F, 5.0F, 3.0F, 3.0F, 0.0F, false);

		horn_puzo_left2 = new ModelRenderer(this);
		horn_puzo_left2.setPos(-3.1619F, -0.0516F, 0.0F);
		horn_puzo_left.addChild(horn_puzo_left2);
		setRotationAngle(horn_puzo_left2, 0.0F, 0.0F, 0.3054F);
		horn_puzo_left2.texOffs(57, 65).addBox(-5.0F, -1.5F, -2.3226F, 5.0F, 3.0F, 2.0F, 0.0F, false);

		horn_puzo_left3 = new ModelRenderer(this);
		horn_puzo_left3.setPos(-3.6046F, 0.0824F, 0.0F);
		horn_puzo_left2.addChild(horn_puzo_left3);
		setRotationAngle(horn_puzo_left3, 0.0F, 0.0F, 0.3054F);
		horn_puzo_left3.texOffs(58, 70).addBox(-5.0F, -1.5F, -2.2226F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		horn_puzo_left4 = new ModelRenderer(this);
		horn_puzo_left4.setPos(-3.5976F, -0.2396F, 0.0F);
		horn_puzo_left3.addChild(horn_puzo_left4);
		setRotationAngle(horn_puzo_left4, 0.0F, 0.0F, 0.3054F);
		horn_puzo_left4.texOffs(60, 74).addBox(-4.0F, -0.5F, -1.8226F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		horn_puzo_right = new ModelRenderer(this);
		horn_puzo_right.setPos(-10.3137F, 2.1882F, 2.0627F);
		puzo.addChild(horn_puzo_right);
		setRotationAngle(horn_puzo_right, 2.0163F, -0.4302F, -2.3817F);
		horn_puzo_right.texOffs(55, 57).addBox(-5.0F, -1.5F, -2.8226F, 5.0F, 3.0F, 3.0F, 0.0F, false);

		horn_puzo_right2 = new ModelRenderer(this);
		horn_puzo_right2.setPos(-3.1619F, -0.0516F, 0.0F);
		horn_puzo_right.addChild(horn_puzo_right2);
		setRotationAngle(horn_puzo_right2, 0.0F, 0.0F, 0.3054F);
		horn_puzo_right2.texOffs(57, 65).addBox(-5.0F, -1.5F, -2.3226F, 5.0F, 3.0F, 2.0F, 0.0F, false);

		horn_puzo_right3 = new ModelRenderer(this);
		horn_puzo_right3.setPos(-3.6046F, 0.0824F, 0.0F);
		horn_puzo_right2.addChild(horn_puzo_right3);
		setRotationAngle(horn_puzo_right3, 0.0F, 0.0F, 0.3054F);
		horn_puzo_right3.texOffs(58, 70).addBox(-5.0F, -1.5F, -2.2226F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		horn_puzo_right4 = new ModelRenderer(this);
		horn_puzo_right4.setPos(-3.5976F, -0.2396F, 0.0F);
		horn_puzo_right3.addChild(horn_puzo_right4);
		setRotationAngle(horn_puzo_right4, 0.0F, 0.0F, 0.3054F);
		horn_puzo_right4.texOffs(60, 74).addBox(-4.0F, -0.5F, -1.8226F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		povyazka = new ModelRenderer(this);
		povyazka.setPos(3.0F, 4.0F, 0.0F);
		puzo.addChild(povyazka);
		povyazka.texOffs(0, 66).addBox(-5.0F, -6.0F, -1.0F, 14.0F, 14.0F, 0.0F, 0.0F, false);

		leftArmArmour = new ModelRenderer(this);
		leftArmArmour.setPos(9.0F, -15.0F, 1.0F);
		setRotationAngle(leftArmArmour, 0.0F, 0.0F, -0.3927F);
		leftArmArmour.texOffs(90, 70).addBox(-3.0F, -2.0F, -5.0F, 9.0F, 11.0F, 10.0F, 0.5F, false);
		leftArmArmour.texOffs(90, 23).addBox(-3.0F, -2.0F, -5.0F, 9.0F, 11.0F, 10.0F, 0.3F, false);
		leftArmArmour.texOffs(110, 0).addBox(5.6194F, -2.0866F, 0.0F, 9.0F, 12.0F, 0.0F, 0.0F, false);

		leftArmArmour2 = new ModelRenderer(this);
		leftArmArmour2.setPos(-0.2898F, 8.5391F, 0.0F);
		leftArmArmour.addChild(leftArmArmour2);
		setRotationAngle(leftArmArmour2, 0.0F, 0.0F, 0.3927F);
		leftArmArmour2.texOffs(98, 93).addBox(-2.0F, -3.0F, -4.0F, 7.0F, 16.0F, 8.0F, 0.5F, false);
		leftArmArmour2.texOffs(98, 46).addBox(-2.0F, -3.0F, -4.0F, 7.0F, 16.0F, 8.0F, 0.4F, false);

		rightArmArmour = new ModelRenderer(this);
		rightArmArmour.setPos(-13.0F, -18.0F, 1.0F);
		setRotationAngle(rightArmArmour, 0.0F, 0.0F, 0.3927F);
		rightArmArmour.texOffs(90, 70).addBox(-1.1522F, -1.2346F, -5.0F, 9.0F, 11.0F, 10.0F, 0.5F, true);
		rightArmArmour.texOffs(90, 23).addBox(-1.1522F, -1.2346F, -5.0F, 9.0F, 11.0F, 10.0F, 0.4F, true);
		rightArmArmour.texOffs(110, 0).addBox(-10.3806F, -1.0866F, 0.0F, 9.0F, 12.0F, 0.0F, 0.0F, false);

		rightArmArmour2 = new ModelRenderer(this);
		rightArmArmour2.setPos(2.1481F, 10.928F, 0.0F);
		rightArmArmour.addChild(rightArmArmour2);
		setRotationAngle(rightArmArmour2, 0.0F, 0.0F, -0.3927F);
		rightArmArmour2.texOffs(98, 93).addBox(-1.2137F, -3.0F, -4.0F, 7.0F, 16.0F, 8.0F, 0.5F, true);
		rightArmArmour2.texOffs(98, 46).addBox(-1.2137F, -3.0F, -4.0F, 7.0F, 16.0F, 8.0F, 0.4F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bodyArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArmArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArmArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}