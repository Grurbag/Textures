// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelKhorneBloodthirster extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body1;
	private final ModelRenderer body_top;
	private final ModelRenderer dick_cape;
	private final ModelRenderer wing_right;
	private final ModelRenderer wing_right2;
	private final ModelRenderer wing_right3;
	private final ModelRenderer wing_right4;
	private final ModelRenderer wing_right5;
	private final ModelRenderer wing_right6;
	private final ModelRenderer wing_pereponka_right;
	private final ModelRenderer wing_left;
	private final ModelRenderer wing_left2;
	private final ModelRenderer wing_left3;
	private final ModelRenderer wing_left4;
	private final ModelRenderer wing_left5;
	private final ModelRenderer wing_left6;
	private final ModelRenderer wing_pereponka_left;
	private final ModelRenderer rightArm;
	private final ModelRenderer hand_right4;
	private final ModelRenderer hand_right2;
	private final ModelRenderer hand_right3;
	private final ModelRenderer weaponPointRight;
	private final ModelRenderer leftArm;
	private final ModelRenderer hand_left_r1;
	private final ModelRenderer hand_left2;
	private final ModelRenderer hand_left3;
	private final ModelRenderer hand_left4;
	private final ModelRenderer weaponPointLeft;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leg_right;
	private final ModelRenderer leg_right2;
	private final ModelRenderer leg_right3;
	private final ModelRenderer leg_right4;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leg_left;
	private final ModelRenderer leg_left2;
	private final ModelRenderer leg_left3;
	private final ModelRenderer leg_left4;
	private final ModelRenderer head;
	private final ModelRenderer horn_right;
	private final ModelRenderer horn_right2;
	private final ModelRenderer horn_right3;
	private final ModelRenderer horn_left;
	private final ModelRenderer horn_left2;
	private final ModelRenderer horn_left3;
	private final ModelRenderer neck;
	private final ModelRenderer horn_head_top_right;
	private final ModelRenderer horn_head_top_right2;
	private final ModelRenderer horn_head_top_left;
	private final ModelRenderer horn_head_top_left2;

	public WFMModelKhorneBloodthirster() {
		texWidth = 264;
		texHeight = 128;

		body = new ModelRenderer(this);
		body.setPos(2.0F, -12.0F, -1.0F);
		

		body1 = new ModelRenderer(this);
		body1.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(body1);
		setRotationAngle(body1, 0.2618F, 0.0F, 0.0F);
		body1.texOffs(0, 0).addBox(-8.5F, -8.0F, -4.0F, 16.0F, 18.0F, 12.0F, 0.0F, false);

		body_top = new ModelRenderer(this);
		body_top.setPos(-2.0F, 37.0F, -1.0F);
		body1.addChild(body_top);
		body_top.texOffs(63, 9).addBox(-11.2588F, -58.0341F, -5.0F, 24.0F, 13.0F, 15.0F, 0.0F, false);

		dick_cape = new ModelRenderer(this);
		dick_cape.setPos(1.0F, 37.0F, -1.0F);
		body.addChild(dick_cape);
		setRotationAngle(dick_cape, 0.0F, -1.5708F, 0.0F);
		dick_cape.texOffs(39, 37).addBox(0.0F, -32.0F, -4.0F, 0.0F, 19.0F, 12.0F, 0.0F, false);

		wing_right = new ModelRenderer(this);
		wing_right.setPos(-7.5F, -13.0F, 5.5F);
		body.addChild(wing_right);
		setRotationAngle(wing_right, -0.6151F, -1.2548F, 0.1516F);
		wing_right.texOffs(240, 0).addBox(-5.579F, -17.7542F, -3.3209F, 7.0F, 18.0F, 5.0F, 0.0F, false);

		wing_right2 = new ModelRenderer(this);
		wing_right2.setPos(-0.079F, -23.7542F, 3.1791F);
		wing_right.addChild(wing_right2);
		setRotationAngle(wing_right2, 0.6271F, 0.0F, 0.0F);
		wing_right2.texOffs(248, 28).addBox(-3.5F, -13.0F, -9.5F, 4.0F, 18.0F, 4.0F, 0.0F, false);

		wing_right3 = new ModelRenderer(this);
		wing_right3.setPos(0.0F, -10.0F, 1.0F);
		wing_right2.addChild(wing_right3);
		setRotationAngle(wing_right3, -0.6819F, 0.0F, 0.0F);
		wing_right3.texOffs(248, 28).addBox(-3.5F, -13.0F, -9.5F, 4.0F, 18.0F, 4.0F, 0.0F, false);

		wing_right4 = new ModelRenderer(this);
		wing_right4.setPos(0.0F, -10.0F, 1.0F);
		wing_right3.addChild(wing_right4);
		setRotationAngle(wing_right4, -0.6819F, 0.0F, 0.0F);
		wing_right4.texOffs(248, 28).addBox(-3.5F, -13.0F, -9.5F, 4.0F, 18.0F, 4.0F, 0.0F, false);

		wing_right5 = new ModelRenderer(this);
		wing_right5.setPos(0.0F, -10.0F, 1.0F);
		wing_right4.addChild(wing_right5);
		setRotationAngle(wing_right5, -0.6819F, 0.0F, 0.0F);
		wing_right5.texOffs(248, 28).addBox(-3.0F, -13.0F, -9.5F, 3.0F, 18.0F, 3.0F, 0.0F, false);

		wing_right6 = new ModelRenderer(this);
		wing_right6.setPos(0.0F, -9.0F, 1.0F);
		wing_right5.addChild(wing_right6);
		setRotationAngle(wing_right6, -0.0711F, 0.0F, 0.0F);
		wing_right6.texOffs(248, 28).addBox(-2.5F, -10.0F, -9.5F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		wing_pereponka_right = new ModelRenderer(this);
		wing_pereponka_right.setPos(-1.079F, -11.7542F, -0.8209F);
		wing_right.addChild(wing_pereponka_right);
		wing_pereponka_right.texOffs(188, 22).addBox(-0.5F, -48.0F, -8.0F, 0.0F, 68.0F, 38.0F, 0.0F, false);

		wing_left = new ModelRenderer(this);
		wing_left.setPos(4.5F, -13.0F, 4.5F);
		body.addChild(wing_left);
		setRotationAngle(wing_left, -0.8068F, 1.3622F, -0.2845F);
		wing_left.texOffs(240, 0).addBox(-2.2478F, -17.9899F, -2.0874F, 7.0F, 18.0F, 5.0F, 0.0F, false);

		wing_left2 = new ModelRenderer(this);
		wing_left2.setPos(3.2522F, -23.9899F, 4.4126F);
		wing_left.addChild(wing_left2);
		setRotationAngle(wing_left2, 0.6271F, 0.0F, 0.0F);
		wing_left2.texOffs(248, 28).addBox(-3.5F, -13.0F, -9.5F, 4.0F, 18.0F, 4.0F, 0.0F, false);

		wing_left3 = new ModelRenderer(this);
		wing_left3.setPos(0.0F, -10.0F, 1.0F);
		wing_left2.addChild(wing_left3);
		setRotationAngle(wing_left3, -0.6819F, 0.0F, 0.0F);
		wing_left3.texOffs(248, 28).addBox(-3.5F, -13.0F, -9.5F, 4.0F, 18.0F, 4.0F, 0.0F, false);

		wing_left4 = new ModelRenderer(this);
		wing_left4.setPos(0.0F, -10.0F, 1.0F);
		wing_left3.addChild(wing_left4);
		setRotationAngle(wing_left4, -0.6819F, 0.0F, 0.0F);
		wing_left4.texOffs(248, 28).addBox(-3.5F, -13.0F, -9.5F, 4.0F, 18.0F, 4.0F, 0.0F, false);

		wing_left5 = new ModelRenderer(this);
		wing_left5.setPos(0.0F, -10.0F, 1.0F);
		wing_left4.addChild(wing_left5);
		setRotationAngle(wing_left5, -0.6819F, 0.0F, 0.0F);
		wing_left5.texOffs(248, 28).addBox(-3.0F, -13.0F, -9.5F, 3.0F, 18.0F, 3.0F, 0.0F, false);

		wing_left6 = new ModelRenderer(this);
		wing_left6.setPos(0.0F, -9.0F, 1.0F);
		wing_left5.addChild(wing_left6);
		setRotationAngle(wing_left6, -0.0711F, 0.0F, 0.0F);
		wing_left6.texOffs(248, 28).addBox(-2.5F, -10.0F, -9.5F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		wing_pereponka_left = new ModelRenderer(this);
		wing_pereponka_left.setPos(2.2522F, -11.9899F, 0.4126F);
		wing_left.addChild(wing_pereponka_left);
		wing_pereponka_left.texOffs(188, 22).addBox(-0.5F, -48.0F, -8.0F, 0.0F, 68.0F, 38.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-10.0F, -27.5F, -3.0F);
		rightArm.texOffs(0, 34).addBox(-8.0F, -4.5F, -5.0F, 8.0F, 13.0F, 10.0F, 0.0F, false);

		hand_right4 = new ModelRenderer(this);
		hand_right4.setPos(-5.0F, 21.5F, -6.0F);
		rightArm.addChild(hand_right4);
		hand_right4.texOffs(0, 77).addBox(-2.0F, -14.0F, 1.5F, 7.0F, 9.0F, 8.0F, 0.0F, false);

		hand_right2 = new ModelRenderer(this);
		hand_right2.setPos(-5.0F, 11.5F, -5.0F);
		rightArm.addChild(hand_right2);
		setRotationAngle(hand_right2, -0.5236F, 0.0F, 0.0F);
		hand_right2.texOffs(0, 57).addBox(-1.5F, -1.0F, 1.0F, 6.0F, 10.0F, 7.0F, 0.0F, false);

		hand_right3 = new ModelRenderer(this);
		hand_right3.setPos(1.0F, 6.0F, -1.0F);
		hand_right2.addChild(hand_right3);
		hand_right3.texOffs(0, 96).addBox(-3.0F, 3.0F, 1.5F, 7.0F, 6.0F, 8.0F, 0.0F, false);

		weaponPointRight = new ModelRenderer(this);
		weaponPointRight.setPos(1.0F, 9.0F, 2.0F);
		hand_right3.addChild(weaponPointRight);
		weaponPointRight.texOffs(4, 2).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(13.0F, -27.5F, -3.0F);
		

		hand_left_r1 = new ModelRenderer(this);
		hand_left_r1.setPos(1.0F, 48.5F, -17.0F);
		leftArm.addChild(hand_left_r1);
		setRotationAngle(hand_left_r1, 0.0F, 3.1416F, 0.0F);
		hand_left_r1.texOffs(0, 34).addBox(-7.0F, -53.0F, -22.0F, 8.0F, 13.0F, 10.0F, 0.0F, false);

		hand_left2 = new ModelRenderer(this);
		hand_left2.setPos(3.0F, 21.5F, -6.0F);
		leftArm.addChild(hand_left2);
		hand_left2.texOffs(0, 77).addBox(-2.0F, -14.0F, 1.5F, 7.0F, 9.0F, 8.0F, 0.0F, false);

		hand_left3 = new ModelRenderer(this);
		hand_left3.setPos(3.0F, 11.5F, -5.0F);
		leftArm.addChild(hand_left3);
		setRotationAngle(hand_left3, -0.5236F, 0.0F, 0.0F);
		hand_left3.texOffs(0, 57).addBox(-1.5F, -1.0F, 1.0F, 6.0F, 10.0F, 7.0F, 0.0F, false);

		hand_left4 = new ModelRenderer(this);
		hand_left4.setPos(1.0F, 6.0F, -1.0F);
		hand_left3.addChild(hand_left4);
		hand_left4.texOffs(0, 96).addBox(-3.0F, 3.0F, 1.5F, 7.0F, 6.0F, 8.0F, 0.0F, false);

		weaponPointLeft = new ModelRenderer(this);
		weaponPointLeft.setPos(0.0F, 9.0F, 3.0F);
		hand_left4.addChild(weaponPointLeft);
		weaponPointLeft.texOffs(4, 2).addBox(1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-4.0F, -4.0F, 4.0F);
		

		leg_right = new ModelRenderer(this);
		leg_right.setPos(0.0F, 0.0F, 0.0F);
		rightLeg.addChild(leg_right);
		setRotationAngle(leg_right, -1.5708F, -0.9163F, 1.5708F);
		leg_right.texOffs(80, 37).addBox(-6.0F, -3.5F, -2.0F, 10.0F, 17.0F, 9.0F, 0.0F, false);

		leg_right2 = new ModelRenderer(this);
		leg_right2.setPos(3.6637F, 13.793F, 0.0F);
		leg_right.addChild(leg_right2);
		setRotationAngle(leg_right2, 0.0F, 0.0F, -1.309F);
		leg_right2.texOffs(79, 65).addBox(-2.1637F, -7.293F, -1.0F, 8.0F, 13.0F, 7.0F, 0.0F, false);

		leg_right3 = new ModelRenderer(this);
		leg_right3.setPos(2.0F, 8.0F, -3.0F);
		leg_right2.addChild(leg_right3);
		setRotationAngle(leg_right3, 0.0F, 0.0F, -2.4871F);
		leg_right3.texOffs(83, 88).addBox(-1.6638F, -5.2931F, 2.5F, 7.0F, 10.0F, 6.0F, 0.0F, false);

		leg_right4 = new ModelRenderer(this);
		leg_right4.setPos(5.0F, 0.0F, 0.0F);
		leg_right3.addChild(leg_right4);
		setRotationAngle(leg_right4, 0.0F, 0.0F, -3.1416F);
		leg_right4.texOffs(86, 108).addBox(-2.1638F, 3.7069F, 1.5F, 7.0F, 6.0F, 8.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(7.0F, -4.0F, 4.0F);
		

		leg_left = new ModelRenderer(this);
		leg_left.setPos(0.0F, 0.0F, 0.0F);
		leftLeg.addChild(leg_left);
		setRotationAngle(leg_left, -1.5708F, -0.9163F, 1.5708F);
		leg_left.texOffs(80, 37).addBox(-6.0F, -3.5F, -7.0F, 10.0F, 17.0F, 9.0F, 0.0F, false);

		leg_left2 = new ModelRenderer(this);
		leg_left2.setPos(3.6638F, 13.793F, 9.0F);
		leg_left.addChild(leg_left2);
		setRotationAngle(leg_left2, 0.0F, 0.0F, -1.309F);
		leg_left2.texOffs(79, 65).addBox(-2.1638F, -7.293F, -15.0F, 8.0F, 13.0F, 7.0F, 0.0F, false);

		leg_left3 = new ModelRenderer(this);
		leg_left3.setPos(2.0F, 8.0F, -3.0F);
		leg_left2.addChild(leg_left3);
		setRotationAngle(leg_left3, 0.0F, 0.0F, -2.4871F);
		leg_left3.texOffs(83, 88).addBox(-1.6638F, -5.2931F, -11.5F, 7.0F, 10.0F, 6.0F, 0.0F, false);

		leg_left4 = new ModelRenderer(this);
		leg_left4.setPos(5.0F, 0.0F, 0.0F);
		leg_left3.addChild(leg_left4);
		setRotationAngle(leg_left4, 0.0F, 0.0F, -3.1416F);
		leg_left4.texOffs(86, 108).addBox(-2.1638F, 3.7069F, -12.5F, 7.0F, 6.0F, 8.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(1.0F, -26.0F, -7.5F);
		head.texOffs(141, 0).addBox(-9.0F, -15.0F, -17.0F, 18.0F, 18.0F, 18.0F, -3.0F, false);

		horn_right = new ModelRenderer(this);
		horn_right.setPos(-8.5F, -8.0F, -9.5F);
		head.addChild(horn_right);
		setRotationAngle(horn_right, 0.9957F, -0.7573F, -2.7329F);
		horn_right.texOffs(53, 0).addBox(-1.5F, -5.0F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		horn_right2 = new ModelRenderer(this);
		horn_right2.setPos(-1.0F, -8.0F, -1.0F);
		horn_right.addChild(horn_right2);
		setRotationAngle(horn_right2, 2.6003F, -0.4978F, 2.8498F);
		horn_right2.texOffs(68, 0).addBox(-0.5F, -5.0F, 0.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		horn_right3 = new ModelRenderer(this);
		horn_right3.setPos(-1.0F, -6.0F, 0.0F);
		horn_right2.addChild(horn_right3);
		setRotationAngle(horn_right3, -0.5672F, 0.0F, 0.0F);
		horn_right3.texOffs(68, 12).addBox(1.0F, -5.0F, 1.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		horn_left = new ModelRenderer(this);
		horn_left.setPos(8.5F, -9.0F, -10.5F);
		head.addChild(horn_left);
		setRotationAngle(horn_left, 0.63F, 0.3414F, 2.3653F);
		horn_left.texOffs(53, 0).addBox(-0.5F, -5.0F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		horn_left2 = new ModelRenderer(this);
		horn_left2.setPos(1.0F, -8.0F, -1.0F);
		horn_left.addChild(horn_left2);
		setRotationAngle(horn_left2, 2.4511F, -0.2162F, -3.0162F);
		horn_left2.texOffs(68, 0).addBox(-0.5F, -5.0F, 0.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		horn_left3 = new ModelRenderer(this);
		horn_left3.setPos(-1.0F, -6.0F, 0.0F);
		horn_left2.addChild(horn_left3);
		setRotationAngle(horn_left3, -0.5672F, 0.0F, 0.0F);
		horn_left3.texOffs(68, 12).addBox(1.0F, -5.0F, 1.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setPos(4.0F, -4.0F, -8.0F);
		head.addChild(neck);
		setRotationAngle(neck, -0.6545F, 0.0F, 0.0F);
		neck.texOffs(118, 38).addBox(-12.0F, -10.0F, -7.0F, 16.0F, 16.0F, 18.0F, -3.0F, false);

		horn_head_top_right = new ModelRenderer(this);
		horn_head_top_right.setPos(2.5F, -14.0F, -12.5F);
		head.addChild(horn_head_top_right);
		setRotationAngle(horn_head_top_right, 0.124F, 0.2017F, 0.3339F);
		horn_head_top_right.texOffs(68, 0).addBox(-0.5F, -5.0F, 0.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		horn_head_top_right2 = new ModelRenderer(this);
		horn_head_top_right2.setPos(-1.0F, -6.0F, 0.0F);
		horn_head_top_right.addChild(horn_head_top_right2);
		setRotationAngle(horn_head_top_right2, -0.5672F, 0.0F, 0.0F);
		horn_head_top_right2.texOffs(68, 12).addBox(1.0F, -5.0F, 1.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		horn_head_top_left = new ModelRenderer(this);
		horn_head_top_left.setPos(-3.5F, -14.0F, -12.5F);
		head.addChild(horn_head_top_left);
		setRotationAngle(horn_head_top_left, 0.0889F, 0.085F, -0.2073F);
		horn_head_top_left.texOffs(68, 0).addBox(-0.5F, -5.0F, 0.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		horn_head_top_left2 = new ModelRenderer(this);
		horn_head_top_left2.setPos(-1.0F, -6.0F, 0.0F);
		horn_head_top_left.addChild(horn_head_top_left2);
		setRotationAngle(horn_head_top_left2, -0.5672F, 0.0F, 0.0F);
		horn_head_top_left2.texOffs(68, 12).addBox(1.0F, -5.0F, 1.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}