// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelMinotaur extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer jaw_top;
	private final ModelRenderer teeth_r1;
	private final ModelRenderer ring_r1;
	private final ModelRenderer jaw_bot;
	private final ModelRenderer head_r2;
	private final ModelRenderer horn_left;
	private final ModelRenderer horn_left2;
	private final ModelRenderer horn_left3;
	private final ModelRenderer horn_left4;
	private final ModelRenderer horn_left5;
	private final ModelRenderer horn_right;
	private final ModelRenderer horn_right2;
	private final ModelRenderer horn_right3;
	private final ModelRenderer horn_right4;
	private final ModelRenderer horn_right5;
	private final ModelRenderer brov;
	private final ModelRenderer brov2;
	private final ModelRenderer ear_left;
	private final ModelRenderer ear_right;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArm2;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArm2;
	private final ModelRenderer body;
	private final ModelRenderer body2;
	private final ModelRenderer neck;
	private final ModelRenderer griva;
	private final ModelRenderer griva2;
	private final ModelRenderer legRight;
	private final ModelRenderer legRight2;
	private final ModelRenderer legRight3;
	private final ModelRenderer legRight4;
	private final ModelRenderer legLeft_r1;
	private final ModelRenderer legRight5;
	private final ModelRenderer legLeft;
	private final ModelRenderer legLeft2;
	private final ModelRenderer legLeft3;
	private final ModelRenderer legLeft4;
	private final ModelRenderer legLeft_r2;
	private final ModelRenderer legLeft5;

	public WFMModelMinotaur() {
		texWidth = 128;
		texHeight = 128;

		head = new ModelRenderer(this);
		head.setPos(0.0F, -17.9226F, -5.5937F);
		setRotationAngle(head, -0.3054F, 0.0F, 0.0F);
		

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(0.0F, -4.0F, -2.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.4363F, 0.0F, 0.0F);
		head_r1.texOffs(-1, 47).addBox(-5.0F, -2.0F, -8.0F, 10.0F, 11.0F, 10.0F, 0.0F, false);

		jaw_top = new ModelRenderer(this);
		jaw_top.setPos(-1.0F, 2.6108F, -7.3969F);
		head.addChild(jaw_top);
		setRotationAngle(jaw_top, 0.48F, 0.0F, 0.0F);
		

		teeth_r1 = new ModelRenderer(this);
		teeth_r1.setPos(0.0F, -4.0F, -2.0F);
		jaw_top.addChild(teeth_r1);
		setRotationAngle(teeth_r1, 0.4363F, 0.0F, 0.0F);
		teeth_r1.texOffs(0, 81).addBox(-2.0F, 4.0F, -5.0F, 6.0F, 3.0F, 8.0F, -0.3F, false);
		teeth_r1.texOffs(38, 88).addBox(-1.0F, -1.0F, -6.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		teeth_r1.texOffs(0, 68).addBox(-2.0F, 0.0F, -5.0F, 6.0F, 5.0F, 8.0F, 0.0F, false);

		ring_r1 = new ModelRenderer(this);
		ring_r1.setPos(0.0F, -0.9806F, -6.1089F);
		jaw_top.addChild(ring_r1);
		setRotationAngle(ring_r1, 1.309F, 0.0F, 0.0F);
		ring_r1.texOffs(37, 84).addBox(-1.5F, 0.0F, -5.0F, 5.0F, 0.0F, 4.0F, 0.0F, false);

		jaw_bot = new ModelRenderer(this);
		jaw_bot.setPos(-1.0F, 3.222F, -3.6764F);
		head.addChild(jaw_bot);
		setRotationAngle(jaw_bot, 0.7418F, 0.0F, 0.0F);
		

		head_r2 = new ModelRenderer(this);
		head_r2.setPos(0.0F, -1.0F, -2.0F);
		jaw_bot.addChild(head_r2);
		setRotationAngle(head_r2, 0.4363F, 0.0F, 0.0F);
		head_r2.texOffs(36, 100).addBox(-2.5F, -3.0F, -6.0F, 7.0F, 4.0F, 9.0F, -0.3F, false);
		head_r2.texOffs(28, 68).addBox(-2.5F, 0.0F, -6.0F, 7.0F, 4.0F, 9.0F, 0.0F, false);

		horn_left = new ModelRenderer(this);
		horn_left.setPos(-5.0F, -4.2851F, -1.4621F);
		head.addChild(horn_left);
		setRotationAngle(horn_left, 0.2182F, 0.0F, 0.0F);
		horn_left.texOffs(52, 49).addBox(-3.0F, -1.5F, -4.5F, 7.0F, 3.0F, 4.0F, 0.0F, false);

		horn_left2 = new ModelRenderer(this);
		horn_left2.setPos(-2.0F, 0.0F, -1.0F);
		horn_left.addChild(horn_left2);
		setRotationAngle(horn_left2, 0.0F, 0.0F, 0.3054F);
		horn_left2.texOffs(55, 57).addBox(-5.0F, -1.5F, -2.8226F, 5.0F, 3.0F, 3.0F, 0.0F, false);

		horn_left3 = new ModelRenderer(this);
		horn_left3.setPos(-3.1619F, -0.0516F, 0.0F);
		horn_left2.addChild(horn_left3);
		setRotationAngle(horn_left3, 0.0F, 0.0F, 0.3054F);
		horn_left3.texOffs(57, 65).addBox(-5.0F, -1.5F, -2.3226F, 5.0F, 3.0F, 2.0F, 0.0F, false);

		horn_left4 = new ModelRenderer(this);
		horn_left4.setPos(-3.6046F, 0.0824F, 0.0F);
		horn_left3.addChild(horn_left4);
		setRotationAngle(horn_left4, 0.0F, 0.0F, 0.3054F);
		horn_left4.texOffs(58, 70).addBox(-5.0F, -1.5F, -2.2226F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		horn_left5 = new ModelRenderer(this);
		horn_left5.setPos(-3.5976F, -0.2396F, 0.0F);
		horn_left4.addChild(horn_left5);
		setRotationAngle(horn_left5, 0.0F, 0.0F, 0.3054F);
		horn_left5.texOffs(60, 74).addBox(-4.0F, -0.5F, -1.8226F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		horn_right = new ModelRenderer(this);
		horn_right.setPos(5.0F, -3.2029F, -6.3436F);
		head.addChild(horn_right);
		setRotationAngle(horn_right, 2.9234F, 0.0F, -3.1416F);
		horn_right.texOffs(52, 49).addBox(-3.0F, -1.5F, -4.5F, 7.0F, 3.0F, 4.0F, 0.0F, false);

		horn_right2 = new ModelRenderer(this);
		horn_right2.setPos(-2.0F, 0.0F, -1.0F);
		horn_right.addChild(horn_right2);
		setRotationAngle(horn_right2, 0.0F, 0.0F, 0.3054F);
		horn_right2.texOffs(55, 57).addBox(-5.0F, -1.5F, -2.8226F, 5.0F, 3.0F, 3.0F, 0.0F, false);

		horn_right3 = new ModelRenderer(this);
		horn_right3.setPos(-3.1619F, -0.0516F, 0.0F);
		horn_right2.addChild(horn_right3);
		setRotationAngle(horn_right3, 0.0F, 0.0F, 0.3054F);
		horn_right3.texOffs(57, 65).addBox(-5.0F, -1.5F, -2.3226F, 5.0F, 3.0F, 2.0F, 0.0F, false);

		horn_right4 = new ModelRenderer(this);
		horn_right4.setPos(-3.6046F, 0.0824F, 0.0F);
		horn_right3.addChild(horn_right4);
		setRotationAngle(horn_right4, 0.0F, 0.0F, 0.3054F);
		horn_right4.texOffs(58, 70).addBox(-5.0F, -1.5F, -2.2226F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		horn_right5 = new ModelRenderer(this);
		horn_right5.setPos(-3.5976F, -0.2396F, 0.0F);
		horn_right4.addChild(horn_right5);
		setRotationAngle(horn_right5, 0.0F, 0.0F, 0.3054F);
		horn_right5.texOffs(60, 74).addBox(-4.0F, -0.5F, -1.8226F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		brov = new ModelRenderer(this);
		brov.setPos(5.0F, -1.5448F, -7.5642F);
		head.addChild(brov);
		setRotationAngle(brov, 0.6981F, 0.0F, 0.0F);
		brov.texOffs(69, 11).addBox(-2.0F, -1.0F, -3.0F, 3.0F, 2.0F, 5.0F, 0.0F, false);

		brov2 = new ModelRenderer(this);
		brov2.setPos(-4.0F, -1.5448F, -7.5642F);
		head.addChild(brov2);
		setRotationAngle(brov2, 0.6981F, 0.0F, 0.0F);
		brov2.texOffs(69, 11).addBox(-2.0F, -1.0F, -3.0F, 3.0F, 2.0F, 5.0F, 0.0F, true);

		ear_left = new ModelRenderer(this);
		ear_left.setPos(4.5F, 0.0549F, -3.6587F);
		head.addChild(ear_left);
		setRotationAngle(ear_left, 0.2256F, -0.2555F, -0.0579F);
		ear_left.texOffs(74, 19).addBox(0.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, 0.0F, false);

		ear_right = new ModelRenderer(this);
		ear_right.setPos(-4.5F, 0.0549F, -3.6587F);
		head.addChild(ear_right);
		setRotationAngle(ear_right, 0.2284F, 0.298F, 0.0681F);
		ear_right.texOffs(74, 19).addBox(-5.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, 0.0F, true);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(10.0F, -15.0F, 1.0F);
		setRotationAngle(leftArm, 0.0F, 0.0F, -0.3927F);
		leftArm.texOffs(90, 70).addBox(-3.9239F, -2.3827F, -5.0F, 9.0F, 11.0F, 10.0F, 0.0F, false);

		leftArm2 = new ModelRenderer(this);
		leftArm2.setPos(-1.2137F, 8.1564F, 0.0F);
		leftArm.addChild(leftArm2);
		setRotationAngle(leftArm2, 0.0F, 0.0F, 0.3927F);
		leftArm2.texOffs(98, 93).addBox(-2.0F, -3.0F, -4.0F, 7.0F, 16.0F, 8.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-13.0F, -18.0F, 1.0F);
		setRotationAngle(rightArm, 0.0F, 0.0F, 0.3927F);
		rightArm.texOffs(90, 70).addBox(-1.1522F, -1.2346F, -5.0F, 9.0F, 11.0F, 10.0F, 0.0F, true);

		rightArm2 = new ModelRenderer(this);
		rightArm2.setPos(2.1481F, 10.928F, 0.0F);
		rightArm.addChild(rightArm2);
		setRotationAngle(rightArm2, 0.0F, 0.0F, -0.3927F);
		rightArm2.texOffs(98, 93).addBox(-1.2137F, -3.0F, -4.0F, 7.0F, 16.0F, 8.0F, 0.0F, true);

		body = new ModelRenderer(this);
		body.setPos(0.0F, -6.0F, 0.0F);
		body.texOffs(-1, -1).addBox(-10.0F, -13.0F, -6.0F, 20.0F, 12.0F, 13.0F, 0.0F, false);

		body2 = new ModelRenderer(this);
		body2.setPos(0.0F, 10.0F, 0.0F);
		body.addChild(body2);
		body2.texOffs(0, 26).addBox(-7.5F, -11.0F, -5.0F, 15.0F, 10.0F, 11.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setPos(0.0F, -12.5F, -0.5F);
		body.addChild(neck);
		setRotationAngle(neck, -0.4363F, 0.0F, 0.0F);
		neck.texOffs(-1, 108).addBox(-6.0F, -2.5F, -5.5F, 12.0F, 10.0F, 10.0F, 0.0F, false);

		griva = new ModelRenderer(this);
		griva.setPos(0.0F, -15.0F, 0.0F);
		body.addChild(griva);
		setRotationAngle(griva, -0.48F, 0.0F, 0.0F);
		griva.texOffs(67, -15).addBox(0.0F, -6.0F, -8.0F, 0.0F, 7.0F, 15.0F, 0.0F, false);

		griva2 = new ModelRenderer(this);
		griva2.setPos(0.0F, 5.6379F, 10.8266F);
		griva.addChild(griva2);
		setRotationAngle(griva2, -1.0908F, 0.0F, 0.0F);
		griva2.texOffs(59, 11).addBox(-0.01F, -6.0F, -12.0F, 0.0F, 7.0F, 19.0F, 0.0F, false);

		legRight = new ModelRenderer(this);
		legRight.setPos(-6.0F, 5.0F, 0.0F);
		setRotationAngle(legRight, -0.3491F, 0.0F, 0.0F);
		legRight.texOffs(97, -1).addBox(-2.5F, -4.9397F, -4.342F, 8.0F, 13.0F, 8.0F, 0.0F, true);

		legRight2 = new ModelRenderer(this);
		legRight2.setPos(0.0F, 7.0F, 0.0F);
		legRight.addChild(legRight2);
		setRotationAngle(legRight2, 1.0472F, 0.0F, 0.0F);
		legRight2.texOffs(101, 20).addBox(-2.0F, -1.1233F, -1.5912F, 7.0F, 9.0F, 7.0F, 0.0F, true);

		legRight3 = new ModelRenderer(this);
		legRight3.setPos(-1.0F, 5.766F, 1.3572F);
		legRight2.addChild(legRight3);
		setRotationAngle(legRight3, -0.6981F, 0.0F, 0.0F);
		legRight3.texOffs(104, 36).addBox(-0.5F, -1.0F, -4.0F, 6.0F, 10.0F, 6.0F, 0.0F, true);

		legRight4 = new ModelRenderer(this);
		legRight4.setPos(3.0F, 0.0F, -6.0F);
		legRight3.addChild(legRight4);
		

		legLeft_r1 = new ModelRenderer(this);
		legLeft_r1.setPos(1.0F, 7.5F, 0.5F);
		legRight4.addChild(legLeft_r1);
		setRotationAngle(legLeft_r1, 0.0F, 0.7854F, 0.0F);
		legLeft_r1.texOffs(115, 55).addBox(-2.2071F, -2.5F, -0.7929F, 3.0F, 4.0F, 3.0F, 0.0F, false);

		legRight5 = new ModelRenderer(this);
		legRight5.setPos(0.0F, 0.0F, -4.0F);
		legRight3.addChild(legRight5);
		setRotationAngle(legRight5, 0.0F, 0.7854F, 0.0F);
		legRight5.texOffs(116, 64).addBox(-0.5F, 6.0F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		legLeft = new ModelRenderer(this);
		legLeft.setPos(3.0F, 5.0F, 0.0F);
		setRotationAngle(legLeft, -0.3491F, 0.0F, 0.0F);
		legLeft.texOffs(97, -1).addBox(-2.5F, -4.9397F, -4.342F, 8.0F, 13.0F, 8.0F, 0.0F, false);

		legLeft2 = new ModelRenderer(this);
		legLeft2.setPos(0.0F, 7.0F, 0.0F);
		legLeft.addChild(legLeft2);
		setRotationAngle(legLeft2, 1.0472F, 0.0F, 0.0F);
		legLeft2.texOffs(101, 20).addBox(-2.0F, -1.1233F, -1.5912F, 7.0F, 9.0F, 7.0F, 0.0F, false);

		legLeft3 = new ModelRenderer(this);
		legLeft3.setPos(-1.0F, 5.766F, 1.3572F);
		legLeft2.addChild(legLeft3);
		setRotationAngle(legLeft3, -0.6981F, 0.0F, 0.0F);
		legLeft3.texOffs(104, 36).addBox(-0.5F, -1.0F, -4.0F, 6.0F, 10.0F, 6.0F, 0.0F, false);

		legLeft4 = new ModelRenderer(this);
		legLeft4.setPos(0.0F, 0.0F, -6.0F);
		legLeft3.addChild(legLeft4);
		

		legLeft_r2 = new ModelRenderer(this);
		legLeft_r2.setPos(1.0F, 7.5F, 0.5F);
		legLeft4.addChild(legLeft_r2);
		setRotationAngle(legLeft_r2, 0.0F, 0.7854F, 0.0F);
		legLeft_r2.texOffs(115, 55).addBox(-2.2071F, -2.5F, -0.7929F, 3.0F, 4.0F, 3.0F, 0.0F, false);

		legLeft5 = new ModelRenderer(this);
		legLeft5.setPos(3.0F, 0.0F, -4.0F);
		legLeft3.addChild(legLeft5);
		setRotationAngle(legLeft5, 0.0F, 0.7854F, 0.0F);
		legLeft5.texOffs(116, 64).addBox(-0.5F, 6.0F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		legRight.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		legLeft.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}