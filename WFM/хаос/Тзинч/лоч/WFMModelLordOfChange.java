// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelLordOfChange extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body_top;
	private final ModelRenderer cape_dick;
	private final ModelRenderer wing_right;
	private final ModelRenderer wing_right2;
	private final ModelRenderer wing_right3;
	private final ModelRenderer wing_right4;
	private final ModelRenderer wing_right_texture;
	private final ModelRenderer wing_left;
	private final ModelRenderer wing_left2;
	private final ModelRenderer wing_left3;
	private final ModelRenderer wing_left4;
	private final ModelRenderer wing_left_texture;
	private final ModelRenderer head;
	private final ModelRenderer head2;
	private final ModelRenderer neck2;
	private final ModelRenderer neck3;
	private final ModelRenderer head3;
	private final ModelRenderer cluv;
	private final ModelRenderer cluv2;
	private final ModelRenderer cluv_bot;
	private final ModelRenderer cluv_bot2;
	private final ModelRenderer leftArm;
	private final ModelRenderer hand_left;
	private final ModelRenderer hand_left_r1;
	private final ModelRenderer hand_left2;
	private final ModelRenderer hand_left2_r1;
	private final ModelRenderer weaponPointLeft;
	private final ModelRenderer rightArm;
	private final ModelRenderer hand_right;
	private final ModelRenderer hand_right2;
	private final ModelRenderer weaponPointRight;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leg_right;
	private final ModelRenderer leg_right_feathers;
	private final ModelRenderer leg_right2;
	private final ModelRenderer leg_right2_r1;
	private final ModelRenderer leg_right3;
	private final ModelRenderer leg_right3_r1;
	private final ModelRenderer leg_right4;
	private final ModelRenderer leg_right4_r1;
	private final ModelRenderer finger_rignt_1;
	private final ModelRenderer finger_rignt_1_r1;
	private final ModelRenderer finger_rignt_2;
	private final ModelRenderer finger_rignt_2_r1;
	private final ModelRenderer finger_rignt_3;
	private final ModelRenderer finger_rignt_3_r1;
	private final ModelRenderer finger_rignt_4;
	private final ModelRenderer finger_rignt_4_r1;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leg_left;
	private final ModelRenderer leg_left_r1;
	private final ModelRenderer leg_left_feathers;
	private final ModelRenderer leg_left2;
	private final ModelRenderer leg_left2_r1;
	private final ModelRenderer leg_left3;
	private final ModelRenderer leg_left3_r1;
	private final ModelRenderer leg_left4;
	private final ModelRenderer leg_left4_r1;
	private final ModelRenderer finger_left_1;
	private final ModelRenderer finger_left_1_r1;
	private final ModelRenderer finger_left_2;
	private final ModelRenderer finger_left_2_r1;
	private final ModelRenderer finger_left_3;
	private final ModelRenderer finger_left_3_r1;
	private final ModelRenderer finger_left_4;
	private final ModelRenderer finger_left_4_r1;

	public WFMModelLordOfChange() {
		texWidth = 256;
		texHeight = 128;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 24.0F, 0.0F);
		body.texOffs(0, 0).addBox(-6.0F, -52.0F, -7.0F, 14.0F, 18.0F, 13.0F, 0.0F, false);

		body_top = new ModelRenderer(this);
		body_top.setPos(0.0F, -20.0F, 0.0F);
		body.addChild(body_top);
		body_top.texOffs(55, 0).addBox(-8.0F, -43.0F, -16.0F, 18.0F, 13.0F, 21.0F, 0.0F, false);

		cape_dick = new ModelRenderer(this);
		cape_dick.setPos(0.0F, 7.0F, 7.0F);
		body.addChild(cape_dick);
		cape_dick.texOffs(31, 35).addBox(-7.0F, -41.0F, -14.0F, 16.0F, 25.0F, 0.0F, 0.0F, false);

		wing_right = new ModelRenderer(this);
		wing_right.setPos(-5.0F, -62.0F, -9.0F);
		body.addChild(wing_right);
		setRotationAngle(wing_right, -0.5689F, -0.2019F, -0.7863F);
		wing_right.texOffs(244, 0).addBox(-2.0F, -16.0F, -1.0F, 3.0F, 16.0F, 3.0F, 0.0F, false);

		wing_right2 = new ModelRenderer(this);
		wing_right2.setPos(0.0F, -15.0F, 0.0F);
		wing_right.addChild(wing_right2);
		setRotationAngle(wing_right2, 0.5236F, 0.0F, 0.0F);
		wing_right2.texOffs(244, 0).addBox(-2.0F, -16.0F, -1.0F, 3.0F, 16.0F, 3.0F, 0.0F, false);

		wing_right3 = new ModelRenderer(this);
		wing_right3.setPos(0.0F, -15.0F, 0.0F);
		wing_right2.addChild(wing_right3);
		setRotationAngle(wing_right3, 0.48F, 0.0F, 0.0F);
		wing_right3.texOffs(234, 0).addBox(-1.5F, -16.0F, -1.0F, 2.0F, 16.0F, 2.0F, 0.0F, false);

		wing_right4 = new ModelRenderer(this);
		wing_right4.setPos(-1.0F, -9.0F, -5.0F);
		wing_right3.addChild(wing_right4);
		setRotationAngle(wing_right4, -0.7418F, 0.0F, 0.0F);
		wing_right4.texOffs(228, 0).addBox(0.0F, -16.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		wing_right_texture = new ModelRenderer(this);
		wing_right_texture.setPos(-2.0F, 0.0F, 0.0F);
		wing_right.addChild(wing_right_texture);
		wing_right_texture.texOffs(154, 16).addBox(1.0F, -61.0F, -29.0F, 0.0F, 61.0F, 51.0F, 0.0F, false);

		wing_left = new ModelRenderer(this);
		wing_left.setPos(7.0F, -61.0F, -7.0F);
		body.addChild(wing_left);
		setRotationAngle(wing_left, -0.457F, 0.1922F, 0.9388F);
		wing_left.texOffs(244, 0).addBox(-2.0F, -16.0F, -1.0F, 3.0F, 16.0F, 3.0F, 0.0F, false);

		wing_left2 = new ModelRenderer(this);
		wing_left2.setPos(0.0F, -15.0F, 0.0F);
		wing_left.addChild(wing_left2);
		setRotationAngle(wing_left2, 0.5236F, 0.0F, 0.0F);
		wing_left2.texOffs(244, 0).addBox(-2.0F, -16.0F, -1.0F, 3.0F, 16.0F, 3.0F, 0.0F, false);

		wing_left3 = new ModelRenderer(this);
		wing_left3.setPos(0.0F, -15.0F, 0.0F);
		wing_left2.addChild(wing_left3);
		setRotationAngle(wing_left3, 0.48F, 0.0F, 0.0F);
		wing_left3.texOffs(234, 0).addBox(-1.5F, -16.0F, -1.0F, 2.0F, 16.0F, 2.0F, 0.0F, false);

		wing_left4 = new ModelRenderer(this);
		wing_left4.setPos(-1.0F, -9.0F, -5.0F);
		wing_left3.addChild(wing_left4);
		setRotationAngle(wing_left4, -0.7418F, 0.0F, 0.0F);
		wing_left4.texOffs(228, 0).addBox(0.0F, -16.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		wing_left_texture = new ModelRenderer(this);
		wing_left_texture.setPos(-2.0F, 0.0F, 0.0F);
		wing_left.addChild(wing_left_texture);
		wing_left_texture.texOffs(154, 16).addBox(1.0F, -61.0F, -29.0F, 0.0F, 61.0F, 51.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(1.0F, -33.0F, -15.0F);
		

		head2 = new ModelRenderer(this);
		head2.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(head2);
		setRotationAngle(head2, 0.7812F, -0.094F, -0.2769F);
		head2.texOffs(66, 37).addBox(-4.0844F, -3.8968F, -11.2453F, 6.0F, 6.0F, 15.0F, 0.0F, false);

		neck2 = new ModelRenderer(this);
		neck2.setPos(-1.0844F, 2.1032F, -10.2453F);
		head2.addChild(neck2);
		setRotationAngle(neck2, -0.7909F, 0.3169F, -0.3052F);
		neck2.texOffs(65, 60).addBox(-2.5F, -5.0F, -12.0F, 5.0F, 5.0F, 11.0F, 0.0F, false);

		neck3 = new ModelRenderer(this);
		neck3.setPos(0.0F, 0.0F, -12.0F);
		neck2.addChild(neck3);
		setRotationAngle(neck3, -0.8745F, -0.4937F, 0.5157F);
		neck3.texOffs(98, 60).addBox(-1.5F, -4.0F, -9.0F, 3.0F, 3.0F, 9.0F, 0.0F, false);

		head3 = new ModelRenderer(this);
		head3.setPos(0.0F, -3.0F, -7.0F);
		neck3.addChild(head3);
		setRotationAngle(head3, 0.7993F, 0.3679F, 0.056F);
		head3.texOffs(84, 77).addBox(-6.0F, -8.0981F, -12.634F, 12.0F, 14.0F, 16.0F, -3.0F, false);

		cluv = new ModelRenderer(this);
		cluv.setPos(0.8681F, -0.7046F, -15.0F);
		head3.addChild(cluv);
		setRotationAngle(cluv, 0.0F, 3.1416F, -0.2182F);
		cluv.texOffs(232, 21).addBox(0.2164F, -3.5426F, -6.9991F, 0.0F, 7.0F, 12.0F, 0.0F, false);

		cluv2 = new ModelRenderer(this);
		cluv2.setPos(-1.1319F, -0.7046F, -15.0F);
		head3.addChild(cluv2);
		setRotationAngle(cluv2, 0.0F, 3.1416F, 0.2182F);
		cluv2.texOffs(232, 21).addBox(-0.2836F, -3.5426F, -6.9991F, 0.0F, 7.0F, 12.0F, 0.0F, false);

		cluv_bot = new ModelRenderer(this);
		cluv_bot.setPos(0.8681F, 4.2954F, -15.0F);
		head3.addChild(cluv_bot);
		setRotationAngle(cluv_bot, -3.1416F, 0.0F, -2.8798F);
		cluv_bot.texOffs(232, 27).addBox(0.0094F, -3.5426F, -6.9991F, 0.0F, 7.0F, 12.0F, 0.0F, false);

		cluv_bot2 = new ModelRenderer(this);
		cluv_bot2.setPos(-1.1319F, 4.2954F, -15.0F);
		head3.addChild(cluv_bot2);
		setRotationAngle(cluv_bot2, 3.1416F, 0.0F, 2.8798F);
		cluv_bot2.texOffs(232, 27).addBox(-0.0094F, -3.5426F, -6.9991F, 0.0F, 7.0F, 12.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(14.0F, -34.0F, -5.0F);
		

		hand_left = new ModelRenderer(this);
		hand_left.setPos(0.0F, 0.0F, 0.0F);
		leftArm.addChild(hand_left);
		setRotationAngle(hand_left, 0.4363F, 0.0F, 0.0F);
		

		hand_left_r1 = new ModelRenderer(this);
		hand_left_r1.setPos(0.0F, 0.0F, 0.0F);
		hand_left.addChild(hand_left_r1);
		setRotationAngle(hand_left_r1, 0.0F, 3.1416F, 0.0F);
		hand_left_r1.texOffs(166, 0).addBox(-1.0F, -2.0F, -1.0F, 5.0F, 15.0F, 5.0F, 0.0F, false);

		hand_left2 = new ModelRenderer(this);
		hand_left2.setPos(2.0F, 12.0F, 0.0F);
		hand_left.addChild(hand_left2);
		setRotationAngle(hand_left2, -0.9163F, 0.0F, 0.0F);
		

		hand_left2_r1 = new ModelRenderer(this);
		hand_left2_r1.setPos(0.0F, 0.0F, 0.0F);
		hand_left2.addChild(hand_left2_r1);
		setRotationAngle(hand_left2_r1, 0.0F, 3.1416F, 0.0F);
		hand_left2_r1.texOffs(166, 22).addBox(1.5F, 0.0F, 0.0F, 4.0F, 20.0F, 4.0F, 0.0F, false);

		weaponPointLeft = new ModelRenderer(this);
		weaponPointLeft.setPos(-4.0F, 12.0F, -2.0F);
		hand_left2.addChild(weaponPointLeft);
		weaponPointLeft.texOffs(4, 2).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-9.0F, -34.0F, -5.0F);
		

		hand_right = new ModelRenderer(this);
		hand_right.setPos(0.0F, 0.0F, 0.0F);
		rightArm.addChild(hand_right);
		setRotationAngle(hand_right, 0.4363F, 0.0F, 0.0F);
		hand_right.texOffs(166, 0).addBox(-4.0F, -2.0F, -4.0F, 5.0F, 15.0F, 5.0F, 0.0F, false);

		hand_right2 = new ModelRenderer(this);
		hand_right2.setPos(0.0F, 12.0F, 0.0F);
		hand_right.addChild(hand_right2);
		setRotationAngle(hand_right2, -0.9163F, 0.0F, 0.0F);
		hand_right2.texOffs(166, 22).addBox(-4.5F, 0.0F, -3.0F, 4.0F, 20.0F, 4.0F, 0.0F, false);

		weaponPointRight = new ModelRenderer(this);
		weaponPointRight.setPos(-2.0F, 12.0F, -2.0F);
		hand_right2.addChild(weaponPointRight);
		weaponPointRight.texOffs(4, 2).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-6.0F, -13.0F, 1.0F);
		

		leg_right = new ModelRenderer(this);
		leg_right.setPos(0.0F, 0.0F, 0.0F);
		rightLeg.addChild(leg_right);
		setRotationAngle(leg_right, -0.6981F, 0.0F, 0.0F);
		leg_right.texOffs(0, 35).addBox(-3.0F, -1.3572F, -3.766F, 6.0F, 18.0F, 8.0F, 0.0F, false);

		leg_right_feathers = new ModelRenderer(this);
		leg_right_feathers.setPos(0.0F, -3.1874F, -3.98F);
		leg_right.addChild(leg_right_feathers);
		leg_right_feathers.texOffs(0, 77).addBox(-1.0F, -3.0F, 5.0F, 0.0F, 17.0F, 13.0F, 0.0F, false);

		leg_right2 = new ModelRenderer(this);
		leg_right2.setPos(0.0F, 11.8126F, -3.98F);
		leg_right.addChild(leg_right2);
		setRotationAngle(leg_right2, 1.2217F, 0.0F, 0.0F);
		

		leg_right2_r1 = new ModelRenderer(this);
		leg_right2_r1.setPos(0.0F, 0.0F, 0.0F);
		leg_right2.addChild(leg_right2_r1);
		setRotationAngle(leg_right2_r1, 0.2618F, 0.0F, 0.0F);
		leg_right2_r1.texOffs(0, 64).addBox(-2.0F, 1.5355F, -3.5355F, 4.0F, 18.0F, 6.0F, 0.0F, false);

		leg_right3 = new ModelRenderer(this);
		leg_right3.setPos(0.0F, 12.0F, 3.0F);
		leg_right2.addChild(leg_right3);
		setRotationAngle(leg_right3, -1.0472F, 0.0F, 0.0F);
		

		leg_right3_r1 = new ModelRenderer(this);
		leg_right3_r1.setPos(0.0F, 0.0F, 0.0F);
		leg_right3.addChild(leg_right3_r1);
		setRotationAngle(leg_right3_r1, 0.2618F, 0.0F, 0.0F);
		leg_right3_r1.texOffs(24, 67).addBox(-1.5F, 2.8296F, 2.2941F, 3.0F, 16.0F, 4.0F, 0.0F, false);

		leg_right4 = new ModelRenderer(this);
		leg_right4.setPos(0.0F, 0.0F, 0.0F);
		leg_right3.addChild(leg_right4);
		setRotationAngle(leg_right4, -1.0472F, 0.0F, 0.0F);
		

		leg_right4_r1 = new ModelRenderer(this);
		leg_right4_r1.setPos(0.0F, 0.0F, 0.0F);
		leg_right4.addChild(leg_right4_r1);
		setRotationAngle(leg_right4_r1, 2.1817F, 0.0F, 0.0F);
		leg_right4_r1.texOffs(43, 79).addBox(-2.5F, 12.8296F, -14.7059F, 5.0F, 3.0F, 6.0F, 0.0F, false);

		finger_rignt_1 = new ModelRenderer(this);
		finger_rignt_1.setPos(-3.0F, 6.1724F, 20.7012F);
		leg_right4.addChild(finger_rignt_1);
		setRotationAngle(finger_rignt_1, -0.3927F, 0.0F, 0.0F);
		

		finger_rignt_1_r1 = new ModelRenderer(this);
		finger_rignt_1_r1.setPos(2.0F, -1.9433F, -17.6332F);
		finger_rignt_1.addChild(finger_rignt_1_r1);
		setRotationAngle(finger_rignt_1_r1, 2.1817F, 0.0F, 0.0F);
		finger_rignt_1_r1.texOffs(43, 66).addBox(-2.0F, 12.8296F, -14.7059F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		finger_rignt_2 = new ModelRenderer(this);
		finger_rignt_2.setPos(0.0F, 6.1724F, 20.7012F);
		leg_right4.addChild(finger_rignt_2);
		setRotationAngle(finger_rignt_2, -0.3927F, 0.0F, 0.0F);
		

		finger_rignt_2_r1 = new ModelRenderer(this);
		finger_rignt_2_r1.setPos(2.0F, -1.9433F, -17.6332F);
		finger_rignt_2.addChild(finger_rignt_2_r1);
		setRotationAngle(finger_rignt_2_r1, 2.1817F, 0.0F, 0.0F);
		finger_rignt_2_r1.texOffs(43, 66).addBox(-2.5F, 12.8296F, -14.7059F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		finger_rignt_3 = new ModelRenderer(this);
		finger_rignt_3.setPos(-3.0F, 6.1724F, 20.7012F);
		leg_right4.addChild(finger_rignt_3);
		setRotationAngle(finger_rignt_3, -0.3927F, 0.0F, 0.0F);
		

		finger_rignt_3_r1 = new ModelRenderer(this);
		finger_rignt_3_r1.setPos(2.0F, -1.9433F, -17.6332F);
		finger_rignt_3.addChild(finger_rignt_3_r1);
		setRotationAngle(finger_rignt_3_r1, 2.1817F, 0.0F, 0.0F);
		finger_rignt_3_r1.texOffs(43, 66).addBox(3.0F, 12.8296F, -14.7059F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		finger_rignt_4 = new ModelRenderer(this);
		finger_rignt_4.setPos(0.0F, -2.8277F, 20.7012F);
		leg_right4.addChild(finger_rignt_4);
		setRotationAngle(finger_rignt_4, -1.0908F, 0.0F, 0.0F);
		

		finger_rignt_4_r1 = new ModelRenderer(this);
		finger_rignt_4_r1.setPos(0.0F, 0.0F, 0.0F);
		finger_rignt_4.addChild(finger_rignt_4_r1);
		setRotationAngle(finger_rignt_4_r1, 0.9599F, 0.0F, 3.1416F);
		finger_rignt_4_r1.texOffs(43, 66).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(8.0F, -13.0F, 1.0F);
		

		leg_left = new ModelRenderer(this);
		leg_left.setPos(0.0F, 0.0F, 0.0F);
		leftLeg.addChild(leg_left);
		setRotationAngle(leg_left, -0.6981F, 0.0F, 0.0F);
		

		leg_left_r1 = new ModelRenderer(this);
		leg_left_r1.setPos(0.0F, -3.1874F, -3.98F);
		leg_left.addChild(leg_left_r1);
		setRotationAngle(leg_left_r1, 0.0F, 0.0F, -3.1416F);
		leg_left_r1.texOffs(0, 35).addBox(-3.0F, -20.1698F, 0.2139F, 6.0F, 18.0F, 8.0F, 0.0F, false);

		leg_left_feathers = new ModelRenderer(this);
		leg_left_feathers.setPos(-14.0F, -3.1874F, -3.98F);
		leg_left.addChild(leg_left_feathers);
		leg_left_feathers.texOffs(0, 77).addBox(15.0F, -3.0F, 5.0F, 0.0F, 17.0F, 13.0F, 0.0F, false);

		leg_left2 = new ModelRenderer(this);
		leg_left2.setPos(0.0F, 11.8126F, -3.98F);
		leg_left.addChild(leg_left2);
		setRotationAngle(leg_left2, 1.2217F, 0.0F, 0.0F);
		

		leg_left2_r1 = new ModelRenderer(this);
		leg_left2_r1.setPos(0.0F, 0.0F, 0.0F);
		leg_left2.addChild(leg_left2_r1);
		setRotationAngle(leg_left2_r1, 2.8798F, 0.0F, 3.1416F);
		leg_left2_r1.texOffs(0, 64).addBox(-2.0F, 1.5355F, -1.5355F, 4.0F, 18.0F, 6.0F, 0.0F, false);

		leg_left3 = new ModelRenderer(this);
		leg_left3.setPos(0.0F, 12.0F, 3.0F);
		leg_left2.addChild(leg_left3);
		setRotationAngle(leg_left3, -1.0472F, 0.0F, 0.0F);
		

		leg_left3_r1 = new ModelRenderer(this);
		leg_left3_r1.setPos(0.0F, 0.0F, 0.0F);
		leg_left3.addChild(leg_left3_r1);
		setRotationAngle(leg_left3_r1, 2.8798F, 0.0F, -3.1416F);
		leg_left3_r1.texOffs(24, 67).addBox(-1.5F, 2.8296F, -5.7059F, 3.0F, 16.0F, 4.0F, 0.0F, false);

		leg_left4 = new ModelRenderer(this);
		leg_left4.setPos(0.0F, 0.0F, 0.0F);
		leg_left3.addChild(leg_left4);
		setRotationAngle(leg_left4, -1.0472F, 0.0F, 0.0F);
		

		leg_left4_r1 = new ModelRenderer(this);
		leg_left4_r1.setPos(0.0F, 0.0F, 0.0F);
		leg_left4.addChild(leg_left4_r1);
		setRotationAngle(leg_left4_r1, 2.1817F, 0.0F, 0.0F);
		leg_left4_r1.texOffs(43, 79).addBox(-2.5F, 12.8296F, -14.7059F, 5.0F, 3.0F, 6.0F, 0.0F, false);

		finger_left_1 = new ModelRenderer(this);
		finger_left_1.setPos(-3.0F, 6.1724F, 20.7012F);
		leg_left4.addChild(finger_left_1);
		setRotationAngle(finger_left_1, -0.3927F, 0.0F, 0.0F);
		

		finger_left_1_r1 = new ModelRenderer(this);
		finger_left_1_r1.setPos(2.0F, -1.9433F, -17.6332F);
		finger_left_1.addChild(finger_left_1_r1);
		setRotationAngle(finger_left_1_r1, 2.1817F, 0.0F, 0.0F);
		finger_left_1_r1.texOffs(43, 66).addBox(-2.0F, 12.8296F, -14.7059F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		finger_left_2 = new ModelRenderer(this);
		finger_left_2.setPos(0.0F, 6.1724F, 20.7012F);
		leg_left4.addChild(finger_left_2);
		setRotationAngle(finger_left_2, -0.3927F, 0.0F, 0.0F);
		

		finger_left_2_r1 = new ModelRenderer(this);
		finger_left_2_r1.setPos(2.0F, -1.9433F, -17.6332F);
		finger_left_2.addChild(finger_left_2_r1);
		setRotationAngle(finger_left_2_r1, 2.1817F, 0.0F, 0.0F);
		finger_left_2_r1.texOffs(43, 66).addBox(-2.5F, 12.8296F, -14.7059F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		finger_left_3 = new ModelRenderer(this);
		finger_left_3.setPos(-3.0F, 6.1724F, 20.7012F);
		leg_left4.addChild(finger_left_3);
		setRotationAngle(finger_left_3, -0.3927F, 0.0F, 0.0F);
		

		finger_left_3_r1 = new ModelRenderer(this);
		finger_left_3_r1.setPos(2.0F, -1.9433F, -17.6332F);
		finger_left_3.addChild(finger_left_3_r1);
		setRotationAngle(finger_left_3_r1, 2.1817F, 0.0F, 0.0F);
		finger_left_3_r1.texOffs(43, 66).addBox(3.0F, 12.8296F, -14.7059F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		finger_left_4 = new ModelRenderer(this);
		finger_left_4.setPos(0.0F, -2.8277F, 20.7012F);
		leg_left4.addChild(finger_left_4);
		setRotationAngle(finger_left_4, -1.0908F, 0.0F, 0.0F);
		

		finger_left_4_r1 = new ModelRenderer(this);
		finger_left_4_r1.setPos(0.0F, 0.0F, 0.0F);
		finger_left_4.addChild(finger_left_4_r1);
		setRotationAngle(finger_left_4_r1, 0.9599F, 0.0F, -3.1416F);
		finger_left_4_r1.texOffs(43, 66).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}