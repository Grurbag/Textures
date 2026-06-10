// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
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
	private final ModelRenderer leg_right;
	private final ModelRenderer leg_right_r1;
	private final ModelRenderer leg_right2;
	private final ModelRenderer leg_right2_r1;
	private final ModelRenderer leg_right3;
	private final ModelRenderer leg_right3_r1;
	private final ModelRenderer leg_left;
	private final ModelRenderer leg_left_r1;
	private final ModelRenderer leg_left2;
	private final ModelRenderer leg_left2_r1;
	private final ModelRenderer leg_left3;
	private final ModelRenderer leg_left3_r1;
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
	private final ModelRenderer hand_right;
	private final ModelRenderer hand_right_r1;
	private final ModelRenderer hand_right2;
	private final ModelRenderer hand_right2_r1;
	private final ModelRenderer hand_right3;
	private final ModelRenderer hand_right3_r1;
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

	public custom_model() {
		textureWidth = 256;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 25.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -16.0F, -26.0F, -13.0F, 30, 22, 30, 0.0F, false));

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, -33.0F, 0.0F);
		body.addChild(neck);
		

		neck_r1 = new ModelRenderer(this);
		neck_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		neck.addChild(neck_r1);
		setRotationAngle(neck_r1, -0.3927F, 0.0F, 0.0F);
		neck_r1.cubeList.add(new ModelBox(neck_r1, 113, 103, -11.0F, -14.0F, -8.0F, 19, 17, 8, 0.0F, false));

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(0.0F, -22.0F, 0.0F);
		body.addChild(body2);
		body2.cubeList.add(new ModelBox(body2, 121, 0, -14.0F, -18.0F, -7.0F, 26, 14, 22, 0.0F, false));

		body3 = new ModelRenderer(this);
		body3.setRotationPoint(0.0F, -3.0F, -9.0F);
		body.addChild(body3);
		body3.cubeList.add(new ModelBox(body3, 123, 40, -14.0F, -18.0F, -8.0F, 26, 17, 4, 0.0F, false));

		body4 = new ModelRenderer(this);
		body4.setRotationPoint(-11.0F, -3.0F, 1.0F);
		body.addChild(body4);
		setRotationAngle(body4, 0.0F, 1.5708F, 0.0F);
		body4.cubeList.add(new ModelBox(body4, 122, 62, -14.0F, -18.0F, -7.0F, 26, 14, 3, 0.0F, false));

		body5 = new ModelRenderer(this);
		body5.setRotationPoint(21.0F, -3.0F, 1.0F);
		body.addChild(body5);
		setRotationAngle(body5, 0.0F, 1.5708F, 0.0F);
		body5.cubeList.add(new ModelBox(body5, 122, 62, -14.0F, -18.0F, -8.0F, 26, 14, 3, 0.0F, false));

		booba_right = new ModelRenderer(this);
		booba_right.setRotationPoint(-6.0F, -15.0F, -1.0F);
		body.addChild(booba_right);
		booba_right.cubeList.add(new ModelBox(booba_right, 120, 80, -7.0F, -20.0F, -8.0F, 11, 10, 3, 0.0F, false));

		booba_left = new ModelRenderer(this);
		booba_left.setRotationPoint(-6.0F, -15.0F, -1.0F);
		body.addChild(booba_left);
		booba_left.cubeList.add(new ModelBox(booba_left, 120, 80, 6.0F, -20.0F, -8.0F, 11, 10, 3, 0.0F, false));

		gorb = new ModelRenderer(this);
		gorb.setRotationPoint(0.0F, -34.0F, 0.0F);
		body.addChild(gorb);
		gorb.cubeList.add(new ModelBox(gorb, 168, 102, -13.0F, -12.0F, -7.0F, 24, 6, 20, 0.0F, false));

		leg_right = new ModelRenderer(this);
		leg_right.setRotationPoint(-16.0F, 8.0F, 8.0F);
		setRotationAngle(leg_right, -0.8684F, 0.1002F, 0.0844F);
		

		leg_right_r1 = new ModelRenderer(this);
		leg_right_r1.setRotationPoint(1.2194F, 9.2624F, -1.3121F);
		leg_right.addChild(leg_right_r1);
		setRotationAngle(leg_right_r1, -0.3927F, 0.0F, 0.0F);
		leg_right_r1.cubeList.add(new ModelBox(leg_right_r1, 0, 55, -7.0F, -12.0F, -8.0F, 8, 14, 12, 0.0F, false));

		leg_right2 = new ModelRenderer(this);
		leg_right2.setRotationPoint(1.2194F, 9.2624F, -1.3121F);
		leg_right.addChild(leg_right2);
		setRotationAngle(leg_right2, -0.8727F, 0.0F, 0.0F);
		

		leg_right2_r1 = new ModelRenderer(this);
		leg_right2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_right2.addChild(leg_right2_r1);
		setRotationAngle(leg_right2_r1, 0.1309F, 0.0F, 0.0F);
		leg_right2_r1.cubeList.add(new ModelBox(leg_right2_r1, 0, 81, -7.0194F, -5.0F, -4.0F, 8, 8, 12, 0.0F, false));

		leg_right3 = new ModelRenderer(this);
		leg_right3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_right2.addChild(leg_right3);
		setRotationAngle(leg_right3, -0.8727F, 0.0F, 0.0F);
		

		leg_right3_r1 = new ModelRenderer(this);
		leg_right3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_right3.addChild(leg_right3_r1);
		setRotationAngle(leg_right3_r1, -0.48F, 0.0F, 0.0F);
		leg_right3_r1.cubeList.add(new ModelBox(leg_right3_r1, 0, 103, -8.0F, -12.0F, -5.0F, 8, 5, 13, 0.0F, false));

		leg_left = new ModelRenderer(this);
		leg_left.setRotationPoint(21.0F, 13.0F, 0.0F);
		setRotationAngle(leg_left, -0.8651F, -0.1334F, -0.1129F);
		

		leg_left_r1 = new ModelRenderer(this);
		leg_left_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_left.addChild(leg_left_r1);
		setRotationAngle(leg_left_r1, -0.3927F, 0.0F, 0.0F);
		leg_left_r1.cubeList.add(new ModelBox(leg_left_r1, 0, 55, -7.0F, -12.0F, -8.0F, 8, 14, 12, 0.0F, false));

		leg_left2 = new ModelRenderer(this);
		leg_left2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_left.addChild(leg_left2);
		setRotationAngle(leg_left2, -0.8727F, 0.0F, 0.0F);
		

		leg_left2_r1 = new ModelRenderer(this);
		leg_left2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_left2.addChild(leg_left2_r1);
		setRotationAngle(leg_left2_r1, 0.1309F, 0.0F, 0.0F);
		leg_left2_r1.cubeList.add(new ModelBox(leg_left2_r1, 0, 81, -6.9F, -5.0F, -4.0F, 8, 8, 12, 0.0F, false));

		leg_left3 = new ModelRenderer(this);
		leg_left3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_left2.addChild(leg_left3);
		setRotationAngle(leg_left3, -0.8727F, 0.0F, 0.0F);
		

		leg_left3_r1 = new ModelRenderer(this);
		leg_left3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_left3.addChild(leg_left3_r1);
		setRotationAngle(leg_left3_r1, -0.48F, 0.0F, 0.0F);
		leg_left3_r1.cubeList.add(new ModelBox(leg_left3_r1, 0, 103, -6.0F, -12.0F, -5.0F, 8, 5, 13, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -16.0F, -3.0F);
		head.cubeList.add(new ModelBox(head, 176, 60, -11.0F, -12.0F, -15.0F, 20, 20, 20, -4.0F, false));

		horn_right = new ModelRenderer(this);
		horn_right.setRotationPoint(-7.0F, -2.0F, -4.0F);
		head.addChild(horn_right);
		setRotationAngle(horn_right, 0.0F, 0.0F, 0.0436F);
		horn_right.cubeList.add(new ModelBox(horn_right, 0, 0, -6.0F, -3.0F, -3.0F, 7, 3, 2, 0.0F, false));

		horn_right2 = new ModelRenderer(this);
		horn_right2.setRotationPoint(-7.0F, -1.0F, 0.0F);
		horn_right.addChild(horn_right2);
		setRotationAngle(horn_right2, 0.0F, 0.0F, 0.6981F);
		horn_right2.cubeList.add(new ModelBox(horn_right2, 0, 0, -6.0F, -3.0F, -3.1F, 7, 3, 2, 0.0F, false));

		horn_right3 = new ModelRenderer(this);
		horn_right3.setRotationPoint(-6.0F, -1.0F, 0.0F);
		horn_right2.addChild(horn_right3);
		setRotationAngle(horn_right3, 0.0F, 0.0F, 1.2217F);
		horn_right3.cubeList.add(new ModelBox(horn_right3, 0, 6, -6.0F, -2.0F, -2.5F, 7, 2, 1, 0.0F, false));

		horn_right4 = new ModelRenderer(this);
		horn_right4.setRotationPoint(-10.0F, 2.0F, 0.0F);
		horn_right3.addChild(horn_right4);
		setRotationAngle(horn_right4, 0.0F, 0.0F, 2.2253F);
		horn_right4.cubeList.add(new ModelBox(horn_right4, 0, 10, -6.0F, -2.0F, -2.5F, 5, 1, 1, 0.0F, false));

		horn_right_texture = new ModelRenderer(this);
		horn_right_texture.setRotationPoint(0.0F, 0.0F, 0.0F);
		horn_right.addChild(horn_right_texture);
		horn_right_texture.cubeList.add(new ModelBox(horn_right_texture, 0, 14, -11.0F, -14.0F, -2.0F, 12, 11, 0, 0.0F, false));

		horn_left = new ModelRenderer(this);
		horn_left.setRotationPoint(4.0F, -2.0F, -8.0F);
		head.addChild(horn_left);
		setRotationAngle(horn_left, 0.0F, 3.1416F, 0.0436F);
		horn_left.cubeList.add(new ModelBox(horn_left, 0, 0, -6.0F, -3.0F, -3.0F, 7, 3, 2, 0.0F, false));

		horn_left2 = new ModelRenderer(this);
		horn_left2.setRotationPoint(-7.0F, -1.0F, 0.0F);
		horn_left.addChild(horn_left2);
		setRotationAngle(horn_left2, 0.0F, 0.0F, 0.6981F);
		horn_left2.cubeList.add(new ModelBox(horn_left2, 0, 0, -6.0F, -3.0F, -3.1F, 7, 3, 2, 0.0F, false));

		horn_left3 = new ModelRenderer(this);
		horn_left3.setRotationPoint(-6.0F, -1.0F, 0.0F);
		horn_left2.addChild(horn_left3);
		setRotationAngle(horn_left3, 0.0F, 0.0F, 1.2217F);
		horn_left3.cubeList.add(new ModelBox(horn_left3, 0, 6, -6.0F, -2.0F, -2.5F, 7, 2, 1, 0.0F, false));

		horn_left4 = new ModelRenderer(this);
		horn_left4.setRotationPoint(-10.0F, 2.0F, 0.0F);
		horn_left3.addChild(horn_left4);
		setRotationAngle(horn_left4, 0.0F, 0.0F, 2.2253F);
		horn_left4.cubeList.add(new ModelBox(horn_left4, 0, 10, -6.0F, -2.0F, -2.5F, 5, 1, 1, 0.0F, false));

		horn_left_texture = new ModelRenderer(this);
		horn_left_texture.setRotationPoint(0.0F, 0.0F, 0.0F);
		horn_left.addChild(horn_left_texture);
		horn_left_texture.cubeList.add(new ModelBox(horn_left_texture, 0, 14, -11.0F, -14.0F, -2.0F, 12, 11, 0, 0.0F, false));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(-13.0F, -16.0F, 1.0F);
		

		hand_right_r1 = new ModelRenderer(this);
		hand_right_r1.setRotationPoint(-2.0F, 5.0F, 0.0F);
		hand_right.addChild(hand_right_r1);
		setRotationAngle(hand_right_r1, 0.0F, 0.0F, 0.6981F);
		hand_right_r1.cubeList.add(new ModelBox(hand_right_r1, 57, 54, -5.0F, -9.0F, -7.0F, 8, 16, 13, 0.0F, false));

		hand_right2 = new ModelRenderer(this);
		hand_right2.setRotationPoint(-5.0F, 13.0F, -2.0F);
		hand_right.addChild(hand_right2);
		setRotationAngle(hand_right2, -0.4363F, 0.0F, -0.3491F);
		

		hand_right2_r1 = new ModelRenderer(this);
		hand_right2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		hand_right2.addChild(hand_right2_r1);
		setRotationAngle(hand_right2_r1, 0.0F, 0.0F, 0.6981F);
		hand_right2_r1.cubeList.add(new ModelBox(hand_right2_r1, 57, 84, -5.0F, -5.0F, -4.0F, 7, 12, 8, 0.0F, false));

		hand_right3 = new ModelRenderer(this);
		hand_right3.setRotationPoint(-4.0F, 4.0F, 0.0F);
		hand_right2.addChild(hand_right3);
		setRotationAngle(hand_right3, -0.4363F, 0.0F, -0.3491F);
		

		hand_right3_r1 = new ModelRenderer(this);
		hand_right3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		hand_right3.addChild(hand_right3_r1);
		setRotationAngle(hand_right3_r1, 0.0F, 0.0F, 0.6981F);
		hand_right3_r1.cubeList.add(new ModelBox(hand_right3_r1, 61, 105, -4.0F, -1.0F, -4.0F, 6, 10, 7, 0.0F, false));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(10.0F, -16.0F, 1.0F);
		setRotationAngle(hand_left, 0.0F, 0.0F, -1.3526F);
		

		hand_left_r1 = new ModelRenderer(this);
		hand_left_r1.setRotationPoint(-3.0394F, 4.7709F, 0.0F);
		hand_left.addChild(hand_left_r1);
		setRotationAngle(hand_left_r1, 0.0F, 0.0F, 0.6981F);
		hand_left_r1.cubeList.add(new ModelBox(hand_left_r1, 57, 54, -5.0F, -9.0F, -7.0F, 8, 16, 13, 0.0F, false));

		hand_left2 = new ModelRenderer(this);
		hand_left2.setRotationPoint(-10.0394F, 9.7709F, -2.0F);
		hand_left.addChild(hand_left2);
		setRotationAngle(hand_left2, -0.654F, 0.1964F, 0.0918F);
		

		hand_left2_r1 = new ModelRenderer(this);
		hand_left2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		hand_left2.addChild(hand_left2_r1);
		setRotationAngle(hand_left2_r1, 0.0F, 0.0F, 0.6981F);
		hand_left2_r1.cubeList.add(new ModelBox(hand_left2_r1, 57, 84, -5.0F, -5.0F, -4.0F, 7, 12, 8, 0.0F, false));

		hand_left3 = new ModelRenderer(this);
		hand_left3.setRotationPoint(-4.0F, 4.0F, 0.0F);
		hand_left2.addChild(hand_left3);
		setRotationAngle(hand_left3, -0.4363F, 0.0F, -0.3491F);
		

		hand_left3_r1 = new ModelRenderer(this);
		hand_left3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		hand_left3.addChild(hand_left3_r1);
		setRotationAngle(hand_left3_r1, 0.0F, 0.0F, 0.6981F);
		hand_left3_r1.cubeList.add(new ModelBox(hand_left3_r1, 61, 105, -4.0F, -1.0F, -4.0F, 6, 10, 7, 0.0F, false));

		bell = new ModelRenderer(this);
		bell.setRotationPoint(0.0F, 7.0F, 1.0F);
		hand_left3.addChild(bell);
		setRotationAngle(bell, -0.1796F, -0.007F, -1.5187F);
		

		bell_r1 = new ModelRenderer(this);
		bell_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bell.addChild(bell_r1);
		setRotationAngle(bell_r1, 0.0F, 0.0F, 0.6981F);
		bell_r1.cubeList.add(new ModelBox(bell_r1, 244, 0, -2.0F, -4.0F, -3.0F, 3, 12, 3, 0.0F, false));

		bell2 = new ModelRenderer(this);
		bell2.setRotationPoint(2.0F, 1.0F, 0.0F);
		bell.addChild(bell2);
		

		bell2_r1 = new ModelRenderer(this);
		bell2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bell2.addChild(bell2_r1);
		setRotationAngle(bell2_r1, 0.0F, 0.0F, 0.6981F);
		bell2_r1.cubeList.add(new ModelBox(bell2_r1, 220, 16, -7.0F, 3.0F, -6.0F, 9, 5, 9, 0.0F, false));

		bell3 = new ModelRenderer(this);
		bell3.setRotationPoint(-1.0F, -1.0F, 0.0F);
		bell2.addChild(bell3);
		

		bell3_r1 = new ModelRenderer(this);
		bell3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bell3.addChild(bell3_r1);
		setRotationAngle(bell3_r1, 0.0F, 0.0F, 0.6981F);
		bell3_r1.cubeList.add(new ModelBox(bell3_r1, 204, 35, -7.4606F, 7.0F, -8.0F, 13, 9, 13, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		leg_right.render(f5);
		leg_left.render(f5);
		head.render(f5);
		hand_right.render(f5);
		hand_left.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}