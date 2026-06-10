// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer Body2;
	private final ModelRenderer Leg_right;
	private final ModelRenderer Leg_right2;
	private final ModelRenderer Leg_right2_r1;
	private final ModelRenderer Leg_right3;
	private final ModelRenderer Leg_right3_r1;
	private final ModelRenderer leg_left;
	private final ModelRenderer leg_left2;
	private final ModelRenderer leg_left2_r1;
	private final ModelRenderer leg_left3;
	private final ModelRenderer leg_left3_r1;
	private final ModelRenderer head;
	private final ModelRenderer hand_right;
	private final ModelRenderer hand_left;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(-0.5F, 14.0F, 1.0F);
		setRotationAngle(Body, 0.6109F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 10, -3.5F, -4.0F, -2.0F, 7, 8, 4, 0.0F, false));

		Body2 = new ModelRenderer(this);
		Body2.setRotationPoint(-0.5F, -5.0F, -2.0F);
		Body.addChild(Body2);
		setRotationAngle(Body2, 0.6981F, 0.0F, 0.0F);
		Body2.cubeList.add(new ModelBox(Body2, 0, 0, -2.9F, -2.8F, -1.65F, 7, 6, 4, 0.0F, false));

		Leg_right = new ModelRenderer(this);
		Leg_right.setRotationPoint(-3.5F, 16.5F, 1.5F);
		setRotationAngle(Leg_right, -0.6981F, 0.0F, 0.0F);
		Leg_right.cubeList.add(new ModelBox(Leg_right, 0, 24, -1.5F, -1.0912F, -1.6233F, 3, 5, 3, 0.0F, false));

		Leg_right2 = new ModelRenderer(this);
		Leg_right2.setRotationPoint(0.0F, 1.4088F, -0.1233F);
		Leg_right.addChild(Leg_right2);
		setRotationAngle(Leg_right2, -0.6981F, 0.0F, 0.0F);
		

		Leg_right2_r1 = new ModelRenderer(this);
		Leg_right2_r1.setRotationPoint(2.5F, -6.5F, 0.5F);
		Leg_right2.addChild(Leg_right2_r1);
		setRotationAngle(Leg_right2_r1, 1.7453F, 0.0F, 0.0F);
		Leg_right2_r1.cubeList.add(new ModelBox(Leg_right2_r1, 0, 32, -3.5F, -1.0F, -8.0F, 2, 6, 2, 0.0F, false));

		Leg_right3 = new ModelRenderer(this);
		Leg_right3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Leg_right2.addChild(Leg_right3);
		setRotationAngle(Leg_right3, -0.6981F, 0.0F, 0.0F);
		

		Leg_right3_r1 = new ModelRenderer(this);
		Leg_right3_r1.setRotationPoint(2.5F, -6.5F, 0.5F);
		Leg_right3.addChild(Leg_right3_r1);
		setRotationAngle(Leg_right3_r1, 2.0944F, 0.0F, 0.0F);
		Leg_right3_r1.cubeList.add(new ModelBox(Leg_right3_r1, 0, 40, -4.0F, 2.0F, -7.0F, 3, 1, 4, 0.0F, false));

		leg_left = new ModelRenderer(this);
		leg_left.setRotationPoint(2.5F, 16.5F, 1.5F);
		setRotationAngle(leg_left, -0.6981F, 0.0F, 0.0F);
		leg_left.cubeList.add(new ModelBox(leg_left, 0, 24, -1.5F, -1.0912F, -1.6233F, 3, 5, 3, 0.0F, false));

		leg_left2 = new ModelRenderer(this);
		leg_left2.setRotationPoint(0.0F, 1.4088F, -0.1233F);
		leg_left.addChild(leg_left2);
		setRotationAngle(leg_left2, -0.6981F, 0.0F, 0.0F);
		

		leg_left2_r1 = new ModelRenderer(this);
		leg_left2_r1.setRotationPoint(2.5F, -6.5F, 0.5F);
		leg_left2.addChild(leg_left2_r1);
		setRotationAngle(leg_left2_r1, 1.7453F, 0.0F, 0.0F);
		leg_left2_r1.cubeList.add(new ModelBox(leg_left2_r1, 0, 32, -3.5F, -1.0F, -8.0F, 2, 6, 2, 0.0F, false));

		leg_left3 = new ModelRenderer(this);
		leg_left3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_left2.addChild(leg_left3);
		setRotationAngle(leg_left3, -0.6981F, 0.0F, 0.0F);
		

		leg_left3_r1 = new ModelRenderer(this);
		leg_left3_r1.setRotationPoint(2.5F, -6.5F, 0.5F);
		leg_left3.addChild(leg_left3_r1);
		setRotationAngle(leg_left3_r1, 2.0944F, 0.0F, 0.0F);
		leg_left3_r1.cubeList.add(new ModelBox(leg_left3_r1, 0, 40, -4.0F, 2.0F, -7.0F, 3, 1, 4, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(-1.0F, 11.0F, -6.0F);
		head.cubeList.add(new ModelBox(head, 32, 0, -3.5F, -4.0F, -6.3F, 8, 8, 8, -1.5F, false));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(-4.5F, 12.5F, -3.5F);
		hand_right.cubeList.add(new ModelBox(hand_right, 36, 20, -1.5F, -2.5F, -2.0F, 3, 12, 3, -0.4F, false));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(-4.5F, 12.5F, -3.5F);
		hand_left.cubeList.add(new ModelBox(hand_left, 36, 20, 6.5F, -2.5F, -2.0F, 3, 12, 3, -0.4F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		Leg_right.render(f5);
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