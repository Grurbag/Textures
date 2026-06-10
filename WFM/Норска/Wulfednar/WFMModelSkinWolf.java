// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelSkinWolf extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer jaw_bot;
	private final ModelRenderer teeth_bot;
	private final ModelRenderer jaw_top;
	private final ModelRenderer nose;
	private final ModelRenderer ear_left;
	private final ModelRenderer ear_right;
	private final ModelRenderer body;
	private final ModelRenderer body1;
	private final ModelRenderer tail;
	private final ModelRenderer tail_r1;
	private final ModelRenderer leftArm;
	private final ModelRenderer hand_left2;
	private final ModelRenderer weaponPointLeft;
	private final ModelRenderer rightArm;
	private final ModelRenderer hand_right2;
	private final ModelRenderer weaponPointRight;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLeg1;
	private final ModelRenderer leg_left2;
	private final ModelRenderer leg_left3;
	private final ModelRenderer leg_left4;
	private final ModelRenderer finger_left_middle;
	private final ModelRenderer finger_left_left;
	private final ModelRenderer finger_left_right;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLeg1;
	private final ModelRenderer leg_right2;
	private final ModelRenderer leg_right3;
	private final ModelRenderer leg_right4;
	private final ModelRenderer finger_right_middle;
	private final ModelRenderer finger_right_left;
	private final ModelRenderer finger_right_right;

	public WFMModelSkinWolf() {
		texWidth = 256;
		texHeight = 128;

		head = new ModelRenderer(this);
		head.setPos(1.0F, -24.6F, -10.0F);
		setRotationAngle(head, 0.0873F, 0.0F, 0.0F);
		head.texOffs(51, 0).addBox(-5.5F, -7.3823F, -11.4523F, 10.0F, 11.0F, 10.0F, 0.5F, false);

		jaw_bot = new ModelRenderer(this);
		jaw_bot.setPos(-3.5F, 11.6101F, -12.0266F);
		head.addChild(jaw_bot);
		setRotationAngle(jaw_bot, 0.3187F, 0.0F, 0.0F);
		jaw_bot.texOffs(50, 46).addBox(0.0F, -7.5374F, -4.6102F, 6.0F, 2.0F, 8.0F, 0.0F, false);

		teeth_bot = new ModelRenderer(this);
		teeth_bot.setPos(0.0F, -1.0F, 0.0F);
		jaw_bot.addChild(teeth_bot);
		teeth_bot.texOffs(75, 54).addBox(0.0F, -8.5374F, -4.6102F, 6.0F, 2.0F, 8.0F, 0.0F, false);

		jaw_top = new ModelRenderer(this);
		jaw_top.setPos(0.5F, 0.2101F, -1.5266F);
		head.addChild(jaw_top);
		setRotationAngle(jaw_top, 0.1367F, 0.0F, 0.0F);
		jaw_top.texOffs(50, 25).addBox(-5.0F, -5.6501F, -18.1559F, 8.0F, 7.0F, 10.0F, 0.0F, false);

		nose = new ModelRenderer(this);
		nose.setPos(0.5F, 0.2101F, -2.5266F);
		head.addChild(nose);
		setRotationAngle(nose, 0.1367F, 0.0F, 0.0F);
		nose.texOffs(77, 24).addBox(-3.0F, -5.6501F, -18.1559F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		ear_left = new ModelRenderer(this);
		ear_left.setPos(4.0F, -0.3899F, -5.0266F);
		head.addChild(ear_left);
		setRotationAngle(ear_left, 0.0F, 0.2618F, 0.0F);
		ear_left.texOffs(0, 0).addBox(1.4706F, -9.1667F, -3.7561F, 0.0F, 7.0F, 7.0F, 0.0F, false);

		ear_right = new ModelRenderer(this);
		ear_right.setPos(-7.0F, -0.3899F, -5.0266F);
		head.addChild(ear_right);
		setRotationAngle(ear_right, 0.0F, -0.2618F, 0.0F);
		ear_right.texOffs(0, 0).addBox(0.5294F, -9.1667F, -3.7561F, 0.0F, 7.0F, 7.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, -2.0F, -1.1F);
		

		body1 = new ModelRenderer(this);
		body1.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(body1);
		setRotationAngle(body1, 0.182F, 0.0F, 0.0F);
		body1.texOffs(0, 24).addBox(-6.0F, -26.7536F, -5.6003F, 13.0F, 29.0F, 10.0F, 0.5F, false);

		tail = new ModelRenderer(this);
		tail.setPos(0.6111F, 8.8104F, 8.1147F);
		body1.addChild(tail);
		setRotationAngle(tail, 0.0F, -1.5708F, 0.0F);
		

		tail_r1 = new ModelRenderer(this);
		tail_r1.setPos(-3.0F, -8.0F, 2.0F);
		tail.addChild(tail_r1);
		setRotationAngle(tail_r1, 0.0F, 0.0F, -0.5672F);
		tail_r1.texOffs(19, 0).addBox(-2.5154F, -3.7755F, -4.5147F, 5.0F, 18.0F, 5.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(9.0F, -24.0F, -5.0F);
		setRotationAngle(leftArm, 0.0F, 3.1416F, 0.0F);
		leftArm.texOffs(133, 0).addBox(-6.134F, -3.7679F, -4.0F, 8.0F, 8.0F, 9.0F, 0.0F, false);

		hand_left2 = new ModelRenderer(this);
		hand_left2.setPos(-8.134F, 7.2321F, 1.0F);
		leftArm.addChild(hand_left2);
		hand_left2.texOffs(133, 19).addBox(0.0F, -7.0F, -4.0F, 7.0F, 24.0F, 7.0F, 0.0F, false);

		weaponPointLeft = new ModelRenderer(this);
		weaponPointLeft.setPos(-4.0F, 24.0F, 0.0F);
		leftArm.addChild(weaponPointLeft);
		weaponPointLeft.texOffs(4, 2).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-6.0F, -23.0F, -5.0F);
		rightArm.texOffs(133, 0).addBox(-8.134F, -4.7679F, -5.0F, 8.0F, 8.0F, 9.0F, 0.0F, false);

		hand_right2 = new ModelRenderer(this);
		hand_right2.setPos(-9.134F, 6.2321F, 0.0F);
		rightArm.addChild(hand_right2);
		hand_right2.texOffs(133, 19).addBox(-1.0F, -7.0F, -4.0F, 7.0F, 24.0F, 7.0F, 0.0F, false);

		weaponPointRight = new ModelRenderer(this);
		weaponPointRight.setPos(-6.0F, 23.0F, -1.0F);
		rightArm.addChild(weaponPointRight);
		weaponPointRight.texOffs(4, 2).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(4.0F, -2.0F, -1.0F);
		

		leftLeg1 = new ModelRenderer(this);
		leftLeg1.setPos(0.0F, 2.4126F, -1.4452F);
		leftLeg.addChild(leftLeg1);
		setRotationAngle(leftLeg1, -0.4363F, 0.0F, 0.0F);
		leftLeg1.texOffs(105, 1).addBox(0.0F, -5.6252F, -4.0F, 6.0F, 16.0F, 8.0F, 0.5F, false);

		leg_left2 = new ModelRenderer(this);
		leg_left2.setPos(0.1F, 12.4F, -2.4F);
		leftLeg1.addChild(leg_left2);
		setRotationAngle(leg_left2, 1.639F, 0.0F, 0.0F);
		leg_left2.texOffs(106, 27).addBox(0.0F, 6.6874F, 1.8452F, 6.0F, 8.0F, 6.0F, 0.0F, false);

		leg_left3 = new ModelRenderer(this);
		leg_left3.setPos(5.6F, 6.0F, 3.0F);
		leg_left2.addChild(leg_left3);
		setRotationAngle(leg_left3, -1.639F, 0.0F, 0.0F);
		leg_left3.texOffs(107, 44).addBox(-5.2F, -2.3252F, 3.0F, 5.0F, 14.0F, 5.0F, 0.0F, false);

		leg_left4 = new ModelRenderer(this);
		leg_left4.setPos(-5.8F, -7.6F, -5.3F);
		leg_left3.addChild(leg_left4);
		setRotationAngle(leg_left4, 0.4363F, 0.0F, 0.0F);
		leg_left4.texOffs(101, 65).addBox(0.0F, 19.1874F, -3.1548F, 6.0F, 4.0F, 8.0F, 0.0F, false);

		finger_left_middle = new ModelRenderer(this);
		finger_left_middle.setPos(3.0F, 22.5F, -7.0F);
		leg_left4.addChild(finger_left_middle);
		finger_left_middle.texOffs(121, 74).addBox(0.0F, -4.3126F, -4.1548F, 0.0F, 5.0F, 8.0F, 0.0F, false);

		finger_left_left = new ModelRenderer(this);
		finger_left_left.setPos(6.0F, 22.5F, -6.0F);
		leg_left4.addChild(finger_left_left);
		setRotationAngle(finger_left_left, 0.0F, -0.2618F, 0.0F);
		finger_left_left.texOffs(121, 74).addBox(0.0F, -4.3126F, -4.1548F, 0.0F, 5.0F, 8.0F, 0.0F, false);

		finger_left_right = new ModelRenderer(this);
		finger_left_right.setPos(0.0F, 22.5F, -6.0F);
		leg_left4.addChild(finger_left_right);
		setRotationAngle(finger_left_right, 0.0F, 0.2618F, 0.0F);
		finger_left_right.texOffs(121, 74).addBox(0.0F, -4.3126F, -4.1548F, 0.0F, 5.0F, 8.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-4.0F, -2.0F, -1.0F);
		

		rightLeg1 = new ModelRenderer(this);
		rightLeg1.setPos(-1.0F, 0.6F, -0.6F);
		rightLeg.addChild(rightLeg1);
		setRotationAngle(rightLeg1, -0.4363F, 0.0F, 0.0F);
		rightLeg1.texOffs(105, 1).addBox(-4.0F, -3.8126F, -4.8452F, 6.0F, 16.0F, 8.0F, 0.5F, true);

		leg_right2 = new ModelRenderer(this);
		leg_right2.setPos(-3.9F, 12.4F, -2.4F);
		rightLeg1.addChild(leg_right2);
		setRotationAngle(leg_right2, 1.639F, 0.0F, 0.0F);
		leg_right2.texOffs(106, 27).addBox(0.0F, 5.5F, 0.0F, 6.0F, 8.0F, 6.0F, 0.0F, true);

		leg_right3 = new ModelRenderer(this);
		leg_right3.setPos(5.6F, 6.0F, 3.0F);
		leg_right2.addChild(leg_right3);
		setRotationAngle(leg_right3, -1.639F, 0.0F, 0.0F);
		leg_right3.texOffs(107, 44).addBox(-5.2F, -0.5126F, 2.1548F, 5.0F, 14.0F, 5.0F, 0.0F, true);

		leg_right4 = new ModelRenderer(this);
		leg_right4.setPos(-5.8F, -7.6F, -5.3F);
		leg_right3.addChild(leg_right4);
		setRotationAngle(leg_right4, 0.4363F, 0.0F, 0.0F);
		leg_right4.texOffs(101, 65).addBox(0.0F, 21.0F, -4.0F, 6.0F, 4.0F, 8.0F, 0.0F, true);

		finger_right_middle = new ModelRenderer(this);
		finger_right_middle.setPos(3.0F, 22.5F, -7.0F);
		leg_right4.addChild(finger_right_middle);
		finger_right_middle.texOffs(121, 74).addBox(0.0F, -2.5F, -5.0F, 0.0F, 5.0F, 8.0F, 0.0F, true);

		finger_right_left = new ModelRenderer(this);
		finger_right_left.setPos(6.0F, 22.5F, -6.0F);
		leg_right4.addChild(finger_right_left);
		setRotationAngle(finger_right_left, 0.0F, -0.2618F, 0.0F);
		finger_right_left.texOffs(121, 74).addBox(0.0F, -2.5F, -5.0F, 0.0F, 5.0F, 8.0F, 0.0F, true);

		finger_right_right = new ModelRenderer(this);
		finger_right_right.setPos(0.0F, 22.5F, -6.0F);
		leg_right4.addChild(finger_right_right);
		setRotationAngle(finger_right_right, 0.0F, 0.2618F, 0.0F);
		finger_right_right.texOffs(121, 74).addBox(0.0F, -2.5F, -5.0F, 0.0F, 5.0F, 8.0F, 0.0F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}