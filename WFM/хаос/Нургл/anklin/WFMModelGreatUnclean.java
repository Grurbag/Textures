// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelGreatUnclean extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer neck;
	private final ModelRenderer neck_r1;
	private final ModelRenderer body2;
	private final ModelRenderer body3;
	private final ModelRenderer body4;
	private final ModelRenderer body5;
	private final ModelRenderer booba_right;
	private final ModelRenderer booba_left;
	private final ModelRenderer gorb;
	private final ModelRenderer head;
	private final ModelRenderer horn_right;
	private final ModelRenderer horn_right2;
	private final ModelRenderer horn_right3;
	private final ModelRenderer horn_right4;
	private final ModelRenderer horn_right_texture;
	private final ModelRenderer horn_left;
	private final ModelRenderer horn_left2;
	private final ModelRenderer horn_left3;
	private final ModelRenderer horn_left4;
	private final ModelRenderer horn_left_texture;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leg_right;
	private final ModelRenderer leg_right_r1;
	private final ModelRenderer leg_right2;
	private final ModelRenderer leg_right2_r1;
	private final ModelRenderer leg_right3;
	private final ModelRenderer leg_right3_r1;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leg_left;
	private final ModelRenderer leg_left_r1;
	private final ModelRenderer leg_left2;
	private final ModelRenderer leg_left2_r1;
	private final ModelRenderer leg_left3;
	private final ModelRenderer leg_left3_r1;
	private final ModelRenderer leftArm;
	private final ModelRenderer hand_left;
	private final ModelRenderer hand_left_r1;
	private final ModelRenderer hand_left2;
	private final ModelRenderer hand_left2_r1;
	private final ModelRenderer hand_left3;
	private final ModelRenderer hand_left3_r1;
	private final ModelRenderer bell;
	private final ModelRenderer bell_r1;
	private final ModelRenderer bell2;
	private final ModelRenderer bell2_r1;
	private final ModelRenderer bell3;
	private final ModelRenderer bell3_r1;
	private final ModelRenderer pipka2;
	private final ModelRenderer rightArm;
	private final ModelRenderer hand_right;
	private final ModelRenderer hand_right_r1;
	private final ModelRenderer hand_right2;
	private final ModelRenderer hand_right2_r1;
	private final ModelRenderer hand_right3;
	private final ModelRenderer hand_right3_r1;
	private final ModelRenderer pipka;

	public WFMModelGreatUnclean() {
		texWidth = 256;
		texHeight = 128;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 25.0F, 0.0F);
		body.texOffs(0, 0).addBox(-16.0F, -26.0F, -13.0F, 30.0F, 22.0F, 30.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setPos(0.0F, -33.0F, 0.0F);
		body.addChild(neck);
		

		neck_r1 = new ModelRenderer(this);
		neck_r1.setPos(0.0F, 0.0F, 0.0F);
		neck.addChild(neck_r1);
		setRotationAngle(neck_r1, -0.3927F, 0.0F, 0.0F);
		neck_r1.texOffs(113, 103).addBox(-11.0F, -14.0F, -8.0F, 19.0F, 17.0F, 8.0F, 0.0F, false);

		body2 = new ModelRenderer(this);
		body2.setPos(0.0F, -22.0F, 0.0F);
		body.addChild(body2);
		body2.texOffs(121, 0).addBox(-14.0F, -18.0F, -7.0F, 26.0F, 14.0F, 22.0F, 0.0F, false);

		body3 = new ModelRenderer(this);
		body3.setPos(0.0F, -3.0F, -9.0F);
		body.addChild(body3);
		body3.texOffs(123, 40).addBox(-14.0F, -18.0F, -8.0F, 26.0F, 17.0F, 4.0F, 0.0F, false);

		body4 = new ModelRenderer(this);
		body4.setPos(-11.0F, -3.0F, 1.0F);
		body.addChild(body4);
		setRotationAngle(body4, 0.0F, 1.5708F, 0.0F);
		body4.texOffs(122, 62).addBox(-14.0F, -18.0F, -7.0F, 26.0F, 14.0F, 3.0F, 0.0F, false);

		body5 = new ModelRenderer(this);
		body5.setPos(21.0F, -3.0F, 1.0F);
		body.addChild(body5);
		setRotationAngle(body5, 0.0F, 1.5708F, 0.0F);
		body5.texOffs(122, 62).addBox(-14.0F, -18.0F, -8.0F, 26.0F, 14.0F, 3.0F, 0.0F, false);

		booba_right = new ModelRenderer(this);
		booba_right.setPos(-6.0F, -15.0F, -1.0F);
		body.addChild(booba_right);
		booba_right.texOffs(120, 80).addBox(-7.0F, -20.0F, -8.0F, 11.0F, 10.0F, 3.0F, 0.0F, false);

		booba_left = new ModelRenderer(this);
		booba_left.setPos(-6.0F, -15.0F, -1.0F);
		body.addChild(booba_left);
		booba_left.texOffs(120, 80).addBox(6.0F, -20.0F, -8.0F, 11.0F, 10.0F, 3.0F, 0.0F, false);

		gorb = new ModelRenderer(this);
		gorb.setPos(0.0F, -34.0F, 0.0F);
		body.addChild(gorb);
		gorb.texOffs(168, 102).addBox(-13.0F, -12.0F, -7.0F, 24.0F, 6.0F, 20.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -16.0F, -3.0F);
		head.texOffs(176, 60).addBox(-11.0F, -12.0F, -15.0F, 20.0F, 20.0F, 20.0F, -4.0F, false);

		horn_right = new ModelRenderer(this);
		horn_right.setPos(-7.0F, -2.0F, -4.0F);
		head.addChild(horn_right);
		setRotationAngle(horn_right, 0.0F, 0.0F, 0.0436F);
		horn_right.texOffs(0, 0).addBox(-6.0F, -3.0F, -3.0F, 7.0F, 3.0F, 2.0F, 0.0F, false);

		horn_right2 = new ModelRenderer(this);
		horn_right2.setPos(-7.0F, -1.0F, 0.0F);
		horn_right.addChild(horn_right2);
		setRotationAngle(horn_right2, 0.0F, 0.0F, 0.6981F);
		horn_right2.texOffs(0, 0).addBox(-6.0F, -3.0F, -3.1F, 7.0F, 3.0F, 2.0F, 0.0F, false);

		horn_right3 = new ModelRenderer(this);
		horn_right3.setPos(-6.0F, -1.0F, 0.0F);
		horn_right2.addChild(horn_right3);
		setRotationAngle(horn_right3, 0.0F, 0.0F, 1.2217F);
		horn_right3.texOffs(0, 6).addBox(-6.0F, -2.0F, -2.5F, 7.0F, 2.0F, 1.0F, 0.0F, false);

		horn_right4 = new ModelRenderer(this);
		horn_right4.setPos(-10.0F, 2.0F, 0.0F);
		horn_right3.addChild(horn_right4);
		setRotationAngle(horn_right4, 0.0F, 0.0F, 2.2253F);
		horn_right4.texOffs(0, 10).addBox(-6.0F, -2.0F, -2.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		horn_right_texture = new ModelRenderer(this);
		horn_right_texture.setPos(0.0F, 0.0F, 0.0F);
		horn_right.addChild(horn_right_texture);
		horn_right_texture.texOffs(0, 14).addBox(-11.0F, -14.0F, -2.0F, 12.0F, 11.0F, 0.0F, 0.0F, false);

		horn_left = new ModelRenderer(this);
		horn_left.setPos(4.0F, -2.0F, -8.0F);
		head.addChild(horn_left);
		setRotationAngle(horn_left, 0.0F, 3.1416F, 0.0436F);
		horn_left.texOffs(0, 0).addBox(-6.0F, -3.0F, -3.0F, 7.0F, 3.0F, 2.0F, 0.0F, false);

		horn_left2 = new ModelRenderer(this);
		horn_left2.setPos(-7.0F, -1.0F, 0.0F);
		horn_left.addChild(horn_left2);
		setRotationAngle(horn_left2, 0.0F, 0.0F, 0.6981F);
		horn_left2.texOffs(0, 0).addBox(-6.0F, -3.0F, -3.1F, 7.0F, 3.0F, 2.0F, 0.0F, false);

		horn_left3 = new ModelRenderer(this);
		horn_left3.setPos(-6.0F, -1.0F, 0.0F);
		horn_left2.addChild(horn_left3);
		setRotationAngle(horn_left3, 0.0F, 0.0F, 1.2217F);
		horn_left3.texOffs(0, 6).addBox(-6.0F, -2.0F, -2.5F, 7.0F, 2.0F, 1.0F, 0.0F, false);

		horn_left4 = new ModelRenderer(this);
		horn_left4.setPos(-10.0F, 2.0F, 0.0F);
		horn_left3.addChild(horn_left4);
		setRotationAngle(horn_left4, 0.0F, 0.0F, 2.2253F);
		horn_left4.texOffs(0, 10).addBox(-6.0F, -2.0F, -2.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		horn_left_texture = new ModelRenderer(this);
		horn_left_texture.setPos(0.0F, 0.0F, 0.0F);
		horn_left.addChild(horn_left_texture);
		horn_left_texture.texOffs(0, 14).addBox(-11.0F, -14.0F, -2.0F, 12.0F, 11.0F, 0.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-16.0F, 8.0F, 0.0F);
		

		leg_right = new ModelRenderer(this);
		leg_right.setPos(0.0F, 0.0F, 8.0F);
		rightLeg.addChild(leg_right);
		setRotationAngle(leg_right, -0.8684F, 0.1002F, 0.0844F);
		

		leg_right_r1 = new ModelRenderer(this);
		leg_right_r1.setPos(1.2194F, 9.2624F, -1.3121F);
		leg_right.addChild(leg_right_r1);
		setRotationAngle(leg_right_r1, -0.3927F, 0.0F, 0.0F);
		leg_right_r1.texOffs(0, 55).addBox(-7.0F, -12.0F, -8.0F, 8.0F, 14.0F, 12.0F, 0.0F, false);

		leg_right2 = new ModelRenderer(this);
		leg_right2.setPos(1.2194F, 9.2624F, -1.3121F);
		leg_right.addChild(leg_right2);
		setRotationAngle(leg_right2, -0.8727F, 0.0F, 0.0F);
		

		leg_right2_r1 = new ModelRenderer(this);
		leg_right2_r1.setPos(0.0F, 0.0F, 0.0F);
		leg_right2.addChild(leg_right2_r1);
		setRotationAngle(leg_right2_r1, 0.1309F, 0.0F, 0.0F);
		leg_right2_r1.texOffs(0, 81).addBox(-7.0194F, -5.0F, -4.0F, 8.0F, 8.0F, 12.0F, 0.0F, false);

		leg_right3 = new ModelRenderer(this);
		leg_right3.setPos(0.0F, 0.0F, 0.0F);
		leg_right2.addChild(leg_right3);
		setRotationAngle(leg_right3, -0.8727F, 0.0F, 0.0F);
		

		leg_right3_r1 = new ModelRenderer(this);
		leg_right3_r1.setPos(0.0F, 0.0F, 0.0F);
		leg_right3.addChild(leg_right3_r1);
		setRotationAngle(leg_right3_r1, -0.48F, 0.0F, 0.0F);
		leg_right3_r1.texOffs(0, 103).addBox(-8.0F, -12.0F, -5.0F, 8.0F, 5.0F, 13.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(21.0F, 13.0F, 0.0F);
		

		leg_left = new ModelRenderer(this);
		leg_left.setPos(0.0F, 0.0F, 0.0F);
		leftLeg.addChild(leg_left);
		setRotationAngle(leg_left, -0.8651F, -0.1334F, -0.1129F);
		

		leg_left_r1 = new ModelRenderer(this);
		leg_left_r1.setPos(0.0F, 0.0F, 0.0F);
		leg_left.addChild(leg_left_r1);
		setRotationAngle(leg_left_r1, -0.3927F, 0.0F, 0.0F);
		leg_left_r1.texOffs(0, 55).addBox(-7.0F, -12.0F, -8.0F, 8.0F, 14.0F, 12.0F, 0.0F, false);

		leg_left2 = new ModelRenderer(this);
		leg_left2.setPos(0.0F, 0.0F, 0.0F);
		leg_left.addChild(leg_left2);
		setRotationAngle(leg_left2, -0.8727F, 0.0F, 0.0F);
		

		leg_left2_r1 = new ModelRenderer(this);
		leg_left2_r1.setPos(0.0F, 0.0F, 0.0F);
		leg_left2.addChild(leg_left2_r1);
		setRotationAngle(leg_left2_r1, 0.1309F, 0.0F, 0.0F);
		leg_left2_r1.texOffs(0, 81).addBox(-6.9F, -5.0F, -4.0F, 8.0F, 8.0F, 12.0F, 0.0F, false);

		leg_left3 = new ModelRenderer(this);
		leg_left3.setPos(0.0F, 0.0F, 0.0F);
		leg_left2.addChild(leg_left3);
		setRotationAngle(leg_left3, -0.8727F, 0.0F, 0.0F);
		

		leg_left3_r1 = new ModelRenderer(this);
		leg_left3_r1.setPos(0.0F, 0.0F, 0.0F);
		leg_left3.addChild(leg_left3_r1);
		setRotationAngle(leg_left3_r1, -0.48F, 0.0F, 0.0F);
		leg_left3_r1.texOffs(0, 103).addBox(-6.0F, -12.0F, -5.0F, 8.0F, 5.0F, 13.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(10.0F, -16.0F, 0.0F);
		

		hand_left = new ModelRenderer(this);
		hand_left.setPos(0.0F, 0.0F, 1.0F);
		leftArm.addChild(hand_left);
		setRotationAngle(hand_left, 0.0F, 0.0F, -1.3526F);
		

		hand_left_r1 = new ModelRenderer(this);
		hand_left_r1.setPos(-3.0394F, 4.7709F, 0.0F);
		hand_left.addChild(hand_left_r1);
		setRotationAngle(hand_left_r1, 0.0F, 0.0F, 0.6981F);
		hand_left_r1.texOffs(57, 54).addBox(-5.0F, -9.0F, -7.0F, 8.0F, 16.0F, 13.0F, 0.0F, false);

		hand_left2 = new ModelRenderer(this);
		hand_left2.setPos(-10.0394F, 9.7709F, -2.0F);
		hand_left.addChild(hand_left2);
		setRotationAngle(hand_left2, -0.654F, 0.1964F, 0.0918F);
		

		hand_left2_r1 = new ModelRenderer(this);
		hand_left2_r1.setPos(0.0F, 0.0F, 0.0F);
		hand_left2.addChild(hand_left2_r1);
		setRotationAngle(hand_left2_r1, 0.0F, 0.0F, 0.6981F);
		hand_left2_r1.texOffs(57, 84).addBox(-5.0F, -5.0F, -4.0F, 7.0F, 12.0F, 8.0F, 0.0F, false);

		hand_left3 = new ModelRenderer(this);
		hand_left3.setPos(-4.0F, 4.0F, 0.0F);
		hand_left2.addChild(hand_left3);
		setRotationAngle(hand_left3, -0.4363F, 0.0F, -0.3491F);
		

		hand_left3_r1 = new ModelRenderer(this);
		hand_left3_r1.setPos(0.0F, 0.0F, 0.0F);
		hand_left3.addChild(hand_left3_r1);
		setRotationAngle(hand_left3_r1, 0.0F, 0.0F, 0.6981F);
		hand_left3_r1.texOffs(61, 105).addBox(-4.0F, -1.0F, -4.0F, 6.0F, 10.0F, 7.0F, 0.0F, false);

		bell = new ModelRenderer(this);
		bell.setPos(0.0F, 7.0F, 1.0F);
		hand_left3.addChild(bell);
		setRotationAngle(bell, -0.1796F, -0.007F, -1.5187F);
		

		bell_r1 = new ModelRenderer(this);
		bell_r1.setPos(0.0F, 0.0F, 0.0F);
		bell.addChild(bell_r1);
		setRotationAngle(bell_r1, 0.0F, 0.0F, 0.6981F);
		bell_r1.texOffs(244, 0).addBox(-2.0F, -4.0F, -3.0F, 3.0F, 12.0F, 3.0F, 0.0F, false);

		bell2 = new ModelRenderer(this);
		bell2.setPos(2.0F, 1.0F, 0.0F);
		bell.addChild(bell2);
		

		bell2_r1 = new ModelRenderer(this);
		bell2_r1.setPos(0.0F, 0.0F, 0.0F);
		bell2.addChild(bell2_r1);
		setRotationAngle(bell2_r1, 0.0F, 0.0F, 0.6981F);
		bell2_r1.texOffs(220, 16).addBox(-7.0F, 3.0F, -6.0F, 9.0F, 5.0F, 9.0F, 0.0F, false);

		bell3 = new ModelRenderer(this);
		bell3.setPos(-1.0F, -1.0F, 0.0F);
		bell2.addChild(bell3);
		

		bell3_r1 = new ModelRenderer(this);
		bell3_r1.setPos(0.0F, 0.0F, 0.0F);
		bell3.addChild(bell3_r1);
		setRotationAngle(bell3_r1, 0.0F, 0.0F, 0.6981F);
		bell3_r1.texOffs(204, 35).addBox(-7.4606F, 7.0F, -8.0F, 13.0F, 9.0F, 13.0F, 0.0F, false);

		pipka2 = new ModelRenderer(this);
		pipka2.setPos(-7.0F, 5.0F, 1.0F);
		hand_left3.addChild(pipka2);
		pipka2.texOffs(4, 2).addBox(1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-13.0F, -16.0F, 0.0F);
		

		hand_right = new ModelRenderer(this);
		hand_right.setPos(0.0F, 0.0F, 1.0F);
		rightArm.addChild(hand_right);
		

		hand_right_r1 = new ModelRenderer(this);
		hand_right_r1.setPos(-2.0F, 5.0F, 0.0F);
		hand_right.addChild(hand_right_r1);
		setRotationAngle(hand_right_r1, 0.0F, 0.0F, 0.6981F);
		hand_right_r1.texOffs(57, 54).addBox(-5.0F, -9.0F, -7.0F, 8.0F, 16.0F, 13.0F, 0.0F, false);

		hand_right2 = new ModelRenderer(this);
		hand_right2.setPos(-5.0F, 13.0F, -2.0F);
		hand_right.addChild(hand_right2);
		setRotationAngle(hand_right2, -0.4363F, 0.0F, -0.3491F);
		

		hand_right2_r1 = new ModelRenderer(this);
		hand_right2_r1.setPos(0.0F, 0.0F, 0.0F);
		hand_right2.addChild(hand_right2_r1);
		setRotationAngle(hand_right2_r1, 0.0F, 0.0F, 0.6981F);
		hand_right2_r1.texOffs(57, 84).addBox(-5.0F, -5.0F, -4.0F, 7.0F, 12.0F, 8.0F, 0.0F, false);

		hand_right3 = new ModelRenderer(this);
		hand_right3.setPos(-4.0F, 4.0F, 0.0F);
		hand_right2.addChild(hand_right3);
		setRotationAngle(hand_right3, -0.4363F, 0.0F, -0.3491F);
		

		hand_right3_r1 = new ModelRenderer(this);
		hand_right3_r1.setPos(0.0F, 0.0F, 0.0F);
		hand_right3.addChild(hand_right3_r1);
		setRotationAngle(hand_right3_r1, 0.0F, 0.0F, 0.6981F);
		hand_right3_r1.texOffs(61, 105).addBox(-4.0F, -1.0F, -4.0F, 6.0F, 10.0F, 7.0F, 0.0F, false);

		pipka = new ModelRenderer(this);
		pipka.setPos(-6.0F, 6.0F, -1.0F);
		hand_right3.addChild(pipka);
		pipka.texOffs(4, 2).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}