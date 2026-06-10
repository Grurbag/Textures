// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelBeaver extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer tail;
	private final ModelRenderer tail2;
	private final ModelRenderer neck;
	private final ModelRenderer head;
	private final ModelRenderer nose;
	private final ModelRenderer teeth;
	private final ModelRenderer ear_left;
	private final ModelRenderer ear_right;
	private final ModelRenderer leg_left;
	private final ModelRenderer leg_left2;
	private final ModelRenderer leg_left3;
	private final ModelRenderer leg_right;
	private final ModelRenderer leg_right2;
	private final ModelRenderer leg_right3;
	private final ModelRenderer hand_left;
	private final ModelRenderer hand_left2;
	private final ModelRenderer hand_right;
	private final ModelRenderer hand_right2;

	public WFMModelBeaver() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 1.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, -11.0F, -5.5F, 11, 9, 9, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(-6.0F, -3.0F, 0.0F);
		body.addChild(tail);
		tail.cubeList.add(new ModelBox(tail, 46, 51, -2.0F, -6.0F, -4.0F, 2, 7, 6, 0.0F, false));

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(-2.0F, -1.0F, -1.0F);
		tail.addChild(tail2);
		setRotationAngle(tail2, 0.0F, 0.0F, -0.5672F);
		tail2.cubeList.add(new ModelBox(tail2, 32, 45, -9.4627F, -1.8434F, -2.0F, 12, 1, 4, 0.0F, false));

		neck = new ModelRenderer(this);
		neck.setRotationPoint(3.0F, 19.0F, 0.0F);
		neck.cubeList.add(new ModelBox(neck, 0, 19, -1.0F, -5.0F, -3.5F, 5, 7, 7, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(5.0F, 2.0F, 0.0F);
		neck.addChild(head);
		head.cubeList.add(new ModelBox(head, 0, 33, -1.0F, -6.0F, -3.5F, 4, 6, 7, 0.0F, false));

		nose = new ModelRenderer(this);
		nose.setRotationPoint(4.0F, 0.0F, 0.0F);
		head.addChild(nose);
		nose.cubeList.add(new ModelBox(nose, 0, 46, -1.0F, -4.0F, -2.5F, 2, 4, 5, 0.0F, false));

		teeth = new ModelRenderer(this);
		teeth.setRotationPoint(0.0F, 2.0F, 0.0F);
		nose.addChild(teeth);
		teeth.cubeList.add(new ModelBox(teeth, 0, 0, 0.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

		ear_left = new ModelRenderer(this);
		ear_left.setRotationPoint(0.0F, -4.0F, 3.0F);
		head.addChild(ear_left);
		setRotationAngle(ear_left, 0.0F, -0.7854F, 0.0F);
		ear_left.cubeList.add(new ModelBox(ear_left, 8, 60, -1.0F, -3.0F, -1.0F, 1, 2, 2, 0.0F, false));

		ear_right = new ModelRenderer(this);
		ear_right.setRotationPoint(0.0F, -4.0F, -3.0F);
		head.addChild(ear_right);
		setRotationAngle(ear_right, 0.0F, 0.7854F, 0.0F);
		ear_right.cubeList.add(new ModelBox(ear_right, 0, 60, -1.0F, -3.0F, -1.0F, 1, 2, 2, 0.0F, false));

		leg_left = new ModelRenderer(this);
		leg_left.setRotationPoint(-3.0F, 17.0F, 5.0F);
		leg_left.cubeList.add(new ModelBox(leg_left, 50, 0, -2.0F, -2.0F, -1.0F, 5, 5, 2, 0.0F, false));

		leg_left2 = new ModelRenderer(this);
		leg_left2.setRotationPoint(-1.0F, 9.0F, 0.0F);
		leg_left.addChild(leg_left2);
		leg_left2.cubeList.add(new ModelBox(leg_left2, 54, 8, -0.9F, -7.0F, -1.1F, 3, 5, 2, 0.0F, false));

		leg_left3 = new ModelRenderer(this);
		leg_left3.setRotationPoint(1.0F, 3.0F, 0.0F);
		leg_left2.addChild(leg_left3);
		leg_left3.cubeList.add(new ModelBox(leg_left3, 48, 16, -0.9F, -6.0F, -2.1F, 4, 1, 4, 0.0F, false));

		leg_right = new ModelRenderer(this);
		leg_right.setRotationPoint(-3.0F, 17.0F, -5.0F);
		leg_right.cubeList.add(new ModelBox(leg_right, 50, 23, -2.0F, -2.0F, -1.0F, 5, 5, 2, 0.0F, false));

		leg_right2 = new ModelRenderer(this);
		leg_right2.setRotationPoint(-1.0F, 9.0F, 0.0F);
		leg_right.addChild(leg_right2);
		leg_right2.cubeList.add(new ModelBox(leg_right2, 54, 31, -0.9F, -7.0F, -0.9F, 3, 5, 2, 0.0F, false));

		leg_right3 = new ModelRenderer(this);
		leg_right3.setRotationPoint(1.0F, 3.0F, -1.0F);
		leg_right2.addChild(leg_right3);
		leg_right3.cubeList.add(new ModelBox(leg_right3, 48, 39, -0.9F, -6.0F, -0.9F, 4, 1, 4, 0.0F, false));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(4.0F, 18.0F, 4.0F);
		hand_left.cubeList.add(new ModelBox(hand_left, 25, 20, -2.0F, -2.0F, -1.0F, 4, 4, 2, 0.0F, false));

		hand_left2 = new ModelRenderer(this);
		hand_left2.setRotationPoint(-1.0F, 4.0F, 0.0F);
		hand_left.addChild(hand_left2);
		hand_left2.cubeList.add(new ModelBox(hand_left2, 25, 27, 0.1F, -2.0F, -1.0F, 2, 4, 2, 0.0F, false));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(4.0F, 18.0F, -4.0F);
		hand_right.cubeList.add(new ModelBox(hand_right, 24, 34, -2.0F, -2.0F, -1.0F, 4, 4, 2, 0.0F, false));

		hand_right2 = new ModelRenderer(this);
		hand_right2.setRotationPoint(-1.0F, 4.0F, 0.0F);
		hand_right.addChild(hand_right2);
		hand_right2.cubeList.add(new ModelBox(hand_right2, 23, 41, 0.1F, -2.0F, -1.0F, 2, 4, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		neck.render(f5);
		leg_left.render(f5);
		leg_right.render(f5);
		hand_left.render(f5);
		hand_right.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}